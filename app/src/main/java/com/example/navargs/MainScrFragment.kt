package com.example.navargs


import android.os.Bundle
import android.view.*
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    private fun setOnClickListeners(){
        rootView.findViewById<Button>(R.id.btn_start).setOnClickListener {
            findNavController().navigate(R.id.action_main_to_deviceListFragment)
        }
        rootView.findViewById<Button>(R.id.btn_new).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_newFragment)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.options_menu_main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_pairing -> {
                findNavController().navigate(R.id.action_fragmentMain_to_pairing_nav_graph)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
