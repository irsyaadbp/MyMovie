package com.irsyaad.dicodingsubmission.mymovie.ui.tv


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import kotlinx.android.synthetic.main.fragment_tv.*

/**
 * A simple [Fragment] subclass.
 */
class TvFragment : Fragment() {

    private lateinit var tvAdapter: TvAdapter
    private lateinit var viewModel: TvViewModel
    private lateinit var tvShows: ArrayList<DataEntity>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null){
            viewModel = ViewModelProviders.of(this).get(TvViewModel::class.java)
            tvShows = viewModel.getDataTvShow()

            tvAdapter = TvAdapter(activity!!)
            tvAdapter.setData(tvShows)

            recyclerViewTv.layoutManager = LinearLayoutManager(context)
            recyclerViewTv.setHasFixedSize(true)
            recyclerViewTv.adapter = tvAdapter
        }
    }


}
