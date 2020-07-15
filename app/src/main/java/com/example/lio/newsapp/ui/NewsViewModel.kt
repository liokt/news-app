package com.example.lio.newsapp.ui

import androidx.lifecycle.ViewModel
import com.example.lio.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

}