package com.irsyaad.dicodingsubmission.mymovie.ui.detail

import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private lateinit var movieDummy: DataEntity
    private lateinit var tvDummy: DataEntity

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        movieDummy = DataEntity(
            "m10",
            "Aladdin",
            "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
            "https://image.tmdb.org/t/p/w185/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg",
            "ADVENTURE, FANTASY, ROMANCE",
            "7.4",
            "2019",
            "2h 10m"
        )

        tvDummy = DataEntity(
            "t10",
            "Gotham",
            "Before there was Batman, there was GOTHAM.Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "https://image.tmdb.org/t/p/w185/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg",
            "DRAMA, FANTASY, CRIME",
            "7.9",
            "2019",
            "43m, 60m"
        )
    }

    @Test
    fun getDetailMovie(){
        val movie = viewModel.getDetailData(movieDummy.id)

        assertNotNull(movie)

        assertEquals(movieDummy.id, movie.id)
        assertEquals(movieDummy.title, movie.title)
        assertEquals(movieDummy.overview, movie.overview)
        assertEquals(movieDummy.poster, movie.poster)
        assertEquals(movieDummy.genres, movie.genres)
        assertEquals(movieDummy.rating, movie.rating)
        assertEquals(movieDummy.year, movie.year)
        assertEquals(movieDummy.runtime, movie.runtime)
    }

    @Test
    fun getDetailTvShow(){
        val tv = viewModel.getDetailData(tvDummy.id)

        assertNotNull(tv)

        assertEquals(tvDummy.id, tv.id)
        assertEquals(tvDummy.title, tv.title)
        assertEquals(tvDummy.overview, tv.overview)
        assertEquals(tvDummy.poster, tv.poster)
        assertEquals(tvDummy.genres, tv.genres)
        assertEquals(tvDummy.rating, tv.rating)
        assertEquals(tvDummy.year, tv.year)
        assertEquals(tvDummy.runtime, tv.runtime)
    }
}