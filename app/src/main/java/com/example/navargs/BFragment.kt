package com.example.navargs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class BFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        setupTablayout(view)
        return view
    }

    private fun setupTablayout(view: View) {

        val viewPager = view.findViewById<ViewPager>(R.id.container)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabs)

        viewPager.adapter = PagerAdapter(childFragmentManager)
        viewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tabLayout)
        )

        tabLayout.addOnTabSelectedListener(
            TabLayout.ViewPagerOnTabSelectedListener(
                viewPager
            )
        )

    }

}
