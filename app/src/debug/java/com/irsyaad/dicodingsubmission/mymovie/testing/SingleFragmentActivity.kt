package com.irsyaad.dicodingsubmission.mymovie.testing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.FrameLayout
import android.view.Gravity
import androidx.fragment.app.Fragment
import com.irsyaad.dicodingsubmission.mymovie.R








class SingleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val content = FrameLayout(this)
        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT,
            Gravity.CENTER
        )

        content.layoutParams = params
        content.id = R.id.container

        setContentView(content)
    }

    fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, fragment, "TEST")
            .commit()
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, fragment)
            .commit()
    }
}