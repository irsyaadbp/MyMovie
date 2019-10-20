package com.irsyaad.dicodingsubmission.mymovie.ui.detail

import androidx.lifecycle.ViewModel
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import com.irsyaad.dicodingsubmission.mymovie.utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var entity: DataEntity

    fun getDetailData(id: String): DataEntity {
        if (id[0].toString() == "m") {
            for (i in 0 until DataDummy.generateDummyMovies().size) {
                entity = DataDummy.generateDummyMovies()[i]
                if (entity.id == id) {
                    return entity
                }
            }
        } else {
            for (i in 0 until DataDummy.generateDummyTv().size) {
                entity = DataDummy.generateDummyTv()[i]
                if (entity.id == id) {
                    return entity
                }
            }
        }

        return entity
    }
}