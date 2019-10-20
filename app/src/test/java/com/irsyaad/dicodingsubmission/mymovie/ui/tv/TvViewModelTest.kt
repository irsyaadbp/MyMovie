package com.irsyaad.dicodingsubmission.mymovie.ui.tv

import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvViewModelTest {
    private lateinit var viewModel: TvViewModel

    @Before
    fun setUp() {
        viewModel = TvViewModel()
    }

    @Test
    fun getDataTvShow() {
        val tvEntities: ArrayList<DataEntity> = viewModel.getDataTvShow()
        assertNotNull(tvEntities)
        assertEquals(10, tvEntities.size.toLong())
    }
}