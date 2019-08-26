package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainScrFragment : Fragment() {

    private lateinit var rootView:View



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_main_scr, container, false)

        setOnClickListeners()

        return rootView
    }

    private fun setOnClickListeners(){

        rootView.findViewById<Button>(R.id.btn_start).setOnClickListener {
            findNavController().navigate(R.id.action_main_to_deviceListFragment)
        }
        rootView.findViewById<Button>(R.id.btn_quick_pairing).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_pairing_nav_graph)
        }
    }
}
