package com.example.bajp_submission1.ui.tvshow

import androidx.lifecycle.ViewModel
import com.example.bajp_submission1.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow() = DataDummy.dataDummyTvShow()
}