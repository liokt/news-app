package com.example.lio.newsapp.repository

import com.example.lio.newsapp.api.RetrofitClient
import com.example.lio.newsapp.db.ArticleDatabase

class NewsRepository (
    val db: ArticleDatabase
){
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitClient.api.getBreakingNews(countryCode, pageNumber)

}