package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 */
class DeviceListFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_device_list, container, false)

        setClickListener()
        return rootView
    }

    private fun setClickListener() {
        rootView.findViewById<Button>(R.id.btn_start_pairing).setOnClickListener {
            findNavController().navigate(R.id.action_deviceListFragment_to_pairing_nav_graph)
        }
    }


}
