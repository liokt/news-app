package com.example.lio.newsapp.repository

import com.example.lio.newsapp.api.RetrofitClient
import com.example.lio.newsapp.db.ArticleDatabase
import com.example.lio.newsapp.models.Article

class NewsRepository (
    val db: ArticleDatabase
){
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitClient.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitClient.api.searchForNews(searchQuery, pageNumber)

    suspend fun updateOrInsert(article: Article) = db.getArticleDao().updateOrInsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}