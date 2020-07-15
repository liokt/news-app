package com.example.lio.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lio.newsapp.R
import com.example.lio.newsapp.ui.NewsActivity
import com.example.lio.newsapp.ui.NewsViewModel

class ArticleFragment: Fragment(R.layout.fragment_breaking_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}