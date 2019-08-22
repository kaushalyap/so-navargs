package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    private lateinit var rootView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         rootView = inflater.inflate(R.layout.fragment_first, container, false)
        setClickListeners()
        return rootView
    }

    private fun setClickListeners(){
        rootView.findViewById<Button>(R.id.btn_first).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_beforeFragment)
        }
    }

}
