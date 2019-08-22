package com.seriousfolks.navargs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navargs.R
import kotlinx.android.synthetic.main.fragment_first.*


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
