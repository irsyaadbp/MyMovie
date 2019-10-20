package com.irsyaad.dicodingsubmission.mymovie.ui.detail

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.utils.FakeDataDummy
import org.junit.Rule
import org.junit.Test

class DetailTvActivityTest {
    private val dummyTv = FakeDataDummy.generateDummyTv()[0]

    @Rule @JvmField
    var ruleActivity: ActivityTestRule<DetailActivity> = object :
        ActivityTestRule<DetailActivity>(DetailActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
            val result = Intent(targetContext, DetailActivity::class.java)
            result.putExtra(DetailActivity.extraCode, dummyTv.id)
            return result
        }
    }

    @Test
    fun loadTvShows(){
        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText(dummyTv.title)))

        onView(withId(R.id.txtGenres)).check(matches(isDisplayed()))
        onView(withId(R.id.txtGenres)).check(matches(withText(dummyTv.genres)))

        onView(withId(R.id.txtRating)).check(matches(isDisplayed()))
        onView(withId(R.id.txtRating)).check(matches(withText(dummyTv.rating)))

        onView(withId(R.id.txtRuntime)).check(matches(isDisplayed()))
        onView(withId(R.id.txtRuntime)).check(matches(withText(dummyTv.runtime)))

        onView(withId(R.id.txtRating)).check(matches(isDisplayed()))
        onView(withId(R.id.txtRating)).check(matches(withText(dummyTv.rating)))

        onView(withId(R.id.txtYear)).check(matches(isDisplayed()))
        onView(withId(R.id.txtYear)).check(matches(withText(dummyTv.year)))

        onView(withId(R.id.txtOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.txtOverview)).check(matches(withText(dummyTv.overview)))

        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText(dummyTv.title)))

        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText(dummyTv.title)))
    }
}