package com.example.navargs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private lateinit var fragment: Fragment

    override fun getItem(position: Int): Fragment {

        if (position == 0)
            fragment = CFragment.newInstance()
        else if (position == 1)
            fragment = DFragment.newInstance()
        return fragment
    }

    override fun getCount(): Int = 2
}