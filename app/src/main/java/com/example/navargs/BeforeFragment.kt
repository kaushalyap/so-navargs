package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class BeforeFragment : Fragment() {

    private  lateinit var rootView:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_before, container, false)

        setClickListener()

        return rootView
    }

    private fun setClickListener(){

        rootView.findViewById<Button>(R.id.btn_before).setOnClickListener {

            StartFragment.authenticated = true

            val userJohn:User = User(34, "John", 645, UserType.TYPE2, Guardian("Mike"))
            val action = BeforeFragmentDirections.actionGlobalStart(userJohn)
            findNavController().navigate(action)


        }
    }
}
