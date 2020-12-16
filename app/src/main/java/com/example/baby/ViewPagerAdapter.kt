package com.example.baby

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(fa: FragmentActivity?) : FragmentStateAdapter(fa!!) {

    override fun createFragment(pos: Int): Fragment {
        return when (pos) {
            0 -> {
                TabOneFragment()
            }
            1 -> {
                TabTwoFragment()
            }
            2 -> {
                TabThreeFragment()
            }
            else -> TabOneFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}
