package com.irsyaad.dicodingsubmission.mymovie.ui.movie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import kotlinx.android.synthetic.main.fragment_movie.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var viewModel: MovieViewModel
    private lateinit var movies: ArrayList<DataEntity>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null){
            viewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
            movies= viewModel.getDataMovie()

            movieAdapter = MovieAdapter(activity!!)
            movieAdapter.setData(movies)

            recyclerViewMovie.layoutManager = LinearLayoutManager(context)
            recyclerViewMovie.setHasFixedSize(true)
            recyclerViewMovie.adapter = movieAdapter
        }
    }


}
