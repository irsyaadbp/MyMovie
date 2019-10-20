package com.irsyaad.dicodingsubmission.mymovie.ui.tv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.testing.SingleFragmentActivity
import com.irsyaad.dicodingsubmission.mymovie.utils.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TvFragmentTest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule(SingleFragmentActivity::class.java)
    private val tvFragment = TvFragment()

    @Before
    fun setUp() {
        activityRule.activity.setFragment(tvFragment)
    }

    @Test
    fun loadTvShows(){
        onView(withId(R.id.recyclerViewTv)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewTv)).check(RecyclerViewItemCountAssertion(10))
    }

}