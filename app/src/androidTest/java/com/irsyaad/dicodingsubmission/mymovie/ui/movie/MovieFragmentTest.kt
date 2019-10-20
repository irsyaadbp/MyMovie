package com.irsyaad.dicodingsubmission.mymovie.ui.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Rule
import com.irsyaad.dicodingsubmission.mymovie.testing.SingleFragmentActivity
import androidx.test.rule.ActivityTestRule
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.utils.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Test


class MovieFragmentTest{

    @Rule @JvmField
    var activityRule = ActivityTestRule(SingleFragmentActivity::class.java)
    private val movieFragment = MovieFragment()

    @Before
    fun setUp() {
        activityRule.activity.setFragment(movieFragment)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.recyclerViewMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewMovie)).check(RecyclerViewItemCountAssertion(10))
    }
}