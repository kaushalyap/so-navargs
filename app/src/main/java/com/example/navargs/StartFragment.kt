package com.example.navargs


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class StartFragment : Fragment() {

    private lateinit var rootView:View
    private val args: StartFragmentArgs by navArgs()
    private var title:String? = null

    companion object{
        // should be taken from a persistent data source
        // Change to true for returning user flow
        //           false for first time user flow
        var authenticated: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         rootView =  inflater.inflate(R.layout.fragment_start, container, false)


        // assuming the nested flow is something like login flow
        // check whether the user is firs time user(not authenticated)
        if (!authenticated) {

            findNavController().navigate(R.id.action_start_to_navigation)
        }

        rootView.findViewById<Button>(R.id.btn_start).text = title

        setOnClickListeners()

        return rootView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        title = if(this.args.user == null)
            getString(R.string.user_name) // mocks loading saved user name
        else
            this.args.user?.name // when user is first time user read from passed args

    }


    private fun setOnClickListeners(){

        rootView.findViewById<Button>(R.id.btn_start).setOnClickListener {
            findNavController().navigate(R.id.action_start_to_afterFragment2)
        }
    }
}
