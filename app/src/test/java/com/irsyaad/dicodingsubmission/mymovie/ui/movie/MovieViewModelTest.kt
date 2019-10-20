package com.irsyaad.dicodingsubmission.mymovie.ui.movie
import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getDataMovie() {
        val movieEntities: ArrayList<DataEntity> = viewModel.getDataMovie()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities.size.toLong())
    }
}