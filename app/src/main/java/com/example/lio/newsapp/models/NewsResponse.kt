package com.example.lio.newsapp.models

import com.example.lio.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)