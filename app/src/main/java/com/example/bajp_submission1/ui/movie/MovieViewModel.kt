package com.example.bajp_submission1.ui.movie

import androidx.lifecycle.ViewModel
import com.example.bajp_submission1.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies() = DataDummy.dataDummyMovies()
}