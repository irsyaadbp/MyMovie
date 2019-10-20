package com.irsyaad.dicodingsubmission.mymovie.ui.tv

import androidx.lifecycle.ViewModel
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import com.irsyaad.dicodingsubmission.mymovie.utils.DataDummy

class TvViewModel: ViewModel() {
    fun getDataTvShow(): ArrayList<DataEntity>{
        return DataDummy.generateDummyTv()
    }
}