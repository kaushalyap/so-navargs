package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class EnterCodeFragment : Fragment() {

    private  lateinit var rootView:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_enter_code, container, false)

        setClickListener()

        return rootView
    }


    private fun setClickListener(){

        rootView.findViewById<Button>(R.id.btn_done).setOnClickListener {

            findNavController().navigate(R.id.action_pairing_nav_graph_self)


        }
    }
}
