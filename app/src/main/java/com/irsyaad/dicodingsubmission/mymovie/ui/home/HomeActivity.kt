package com.irsyaad.dicodingsubmission.mymovie.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.ui.movie.MovieFragment
import com.irsyaad.dicodingsubmission.mymovie.ui.tv.TvFragment
import kotlinx.android.synthetic.main.activity_home.*
import android.widget.TextView



class HomeActivity : AppCompatActivity() {

    private val selectedMenu = "selected_menu"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)

        navigation.setOnNavigationItemSelectedListener(mNavigationListener)

        if (savedInstanceState != null){
            savedInstanceState.getInt(selectedMenu)
        }else{
            navigation.selectedItemId = R.id.action_movie
        }

    }

    private val mNavigationListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var fragment: Fragment? = null
        if (item.itemId == R.id.action_movie) {
            fragment = MovieFragment()
        } else if (item.itemId == R.id.action_tv) {
            fragment = TvFragment()
        }

        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .commit()
        }
        true
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(selectedMenu, navigation.selectedItemId)
    }
}
