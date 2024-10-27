package com.geeks.hmgeeks_55

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardPagerAdapter(
    fragment: Fragment,
    private val fragments: List<Fragment>
) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = fragments.size
    override fun createFragment(position: Int) = fragments[position]
}