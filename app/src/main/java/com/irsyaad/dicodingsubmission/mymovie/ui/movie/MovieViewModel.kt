package com.irsyaad.dicodingsubmission.mymovie.ui.movie

import androidx.lifecycle.ViewModel
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import com.irsyaad.dicodingsubmission.mymovie.utils.DataDummy

class MovieViewModel: ViewModel() {
    fun getDataMovie(): ArrayList<DataEntity>{
        return DataDummy.generateDummyMovies()
    }
}