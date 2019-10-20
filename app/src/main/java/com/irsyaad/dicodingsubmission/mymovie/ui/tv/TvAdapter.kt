package com.irsyaad.dicodingsubmission.mymovie.ui.tv

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import com.irsyaad.dicodingsubmission.mymovie.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.items_layout.view.*

class TvAdapter(private val activity: Activity) : RecyclerView.Adapter<TvAdapter.TvViewAdapter>() {
    private var tvShows = ArrayList<DataEntity>()

    fun setData(tvShow:ArrayList<DataEntity>){
        tvShows = tvShow
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvAdapter.TvViewAdapter {
        return TvViewAdapter(LayoutInflater.from(parent.context).inflate(R.layout.items_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return tvShows.size
    }

    override fun onBindViewHolder(holder: TvAdapter.TvViewAdapter, position: Int) {
        holder.bind(tvShows[position], activity)

        holder.itemView.setOnClickListener {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(
                DetailActivity.extraCode,
                tvShows[position].id
            )
            activity.startActivity(intent)
        }
    }

    class TvViewAdapter(view: View) : RecyclerView.ViewHolder(view) {
        private val txtTitle = view.txtTitle
        private val txtRating = view.txtRating
        private val txtGenres = view.txtGenres
        private val txtRuntime = view.txtRuntime
        private val imgPoster = view.imgPoster

        fun bind(tvShow: DataEntity, activity: Activity) {
            txtTitle.text = tvShow.title
            txtRating.text = tvShow.rating
            txtGenres.text = tvShow.genres
            txtRuntime.text = tvShow.runtime

            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(16))

            Glide.with(activity)
                .load(tvShow.poster)
                .apply(requestOptions)
                .into(imgPoster)
        }
    }

}