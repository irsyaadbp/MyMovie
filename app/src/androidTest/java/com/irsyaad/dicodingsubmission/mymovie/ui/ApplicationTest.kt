package com.irsyaad.dicodingsubmission.mymovie.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.rule.ActivityTestRule
import com.irsyaad.dicodingsubmission.mymovie.ui.home.HomeActivity
import org.junit.Rule
import org.junit.Test
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Description
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.irsyaad.dicodingsubmission.mymovie.R
import org.hamcrest.Matcher


class ApplicationTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<HomeActivity>(HomeActivity::class.java)

    @Test
    fun toDetailMovieActivity() {
        onView(withId(R.id.recyclerViewMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText("Aladdin")))
    }

    @Test
    fun toDetailTvActivity() {
        onView(withId(R.id.navigation)).check(matches(isDisplayed()))
        onView(withId(R.id.action_tv)).perform(click())
        onView(withId(R.id.recyclerViewTv)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerViewTv)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText("Gotham")))
    }

}