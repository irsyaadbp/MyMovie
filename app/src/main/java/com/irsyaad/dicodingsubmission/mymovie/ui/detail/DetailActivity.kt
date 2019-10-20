package com.irsyaad.dicodingsubmission.mymovie.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.txtTitle

class DetailActivity : AppCompatActivity() {
    private lateinit var viewModel: DetailViewModel
    private var data: DataEntity? = null

    companion object{
        const val extraCode = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        toolbar.title = ""
        setSupportActionBar(toolbar)

        toolbar.setNavigationIcon(R.drawable.ic_back_black)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)

        val id = intent.getStringExtra(extraCode)

        if (id != null){
            data = viewModel.getDetailData(id)

            if(id[0].toString() == "m") txtMovie.visibility = View.VISIBLE
            else txtTvShow.visibility = View.VISIBLE

            setLayout(data!!)
        }
    }

    private fun setLayout(data:DataEntity){
        txtTitle.text = data.title
        txtGenres.text = data.genres
        txtRating.text = data.rating
        txtRuntime.text = data.runtime
        txtYear.text = data.year
        txtOverview.text = data.overview

        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(16))

        Glide.with(this)
            .load(data.poster)
            .apply(requestOptions)
            .into(imgPoster)
    }
}
