package com.irsyaad.dicodingsubmission.mymovie.ui.movie

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.irsyaad.dicodingsubmission.mymovie.R
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import com.irsyaad.dicodingsubmission.mymovie.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.items_layout.view.*
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions



class MovieAdapter(private val activity: Activity) : RecyclerView.Adapter<MovieAdapter.MovieViewAdapter>() {
    private var movies = ArrayList<DataEntity>()

    fun setData(movie:ArrayList<DataEntity>){
        movies = movie
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewAdapter {
        return MovieViewAdapter(LayoutInflater.from(parent.context).inflate(R.layout.items_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewAdapter, position: Int) {
        holder.bind(movies[position], activity)

        holder.itemView.setOnClickListener {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(
                DetailActivity.extraCode,
                movies[position].id
            )
            activity.startActivity(intent)
        }
    }

    class MovieViewAdapter(view: View): RecyclerView.ViewHolder(view) {
        private val txtTitle = view.txtTitle
        private val txtRating = view.txtRating
        private val txtGenres = view.txtGenres
        private val txtRuntime = view.txtRuntime
        private val imgPoster = view.imgPoster

        fun bind(movie: DataEntity, activity: Activity) {
            txtTitle.text = movie.title
            txtRating.text = movie.rating
            txtGenres.text = movie.genres
            txtRuntime.text = movie.runtime

            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(16))

            Glide.with(activity)
                .load(movie.poster)
                .apply(requestOptions)
                .into(imgPoster)
        }

    }
}