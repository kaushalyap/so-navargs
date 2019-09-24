package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AFragment : Fragment() {

    private lateinit var rootView:View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_a, container, false)

        rootView.findViewById<Button>(R.id.btn_goto_b).setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }
        return rootView
    }

}
