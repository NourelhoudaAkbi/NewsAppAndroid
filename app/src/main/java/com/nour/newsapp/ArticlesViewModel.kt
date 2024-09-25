package com.nour.newsapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArticlesViewModel {
    var articles = MutableLiveData<ArrayList<Article>>()
    var article = MutableLiveData<Article>()
    fun getLatestNews() = CoroutineScope(Dispatchers.IO).launch {
        try {
            val response = RetrofitInstance.newsApi.getLatestNews()
            if (response.isSuccessful) {
                CoroutineScope(Dispatchers.Main).launch {
                    articles.value = response.body()?.results as ArrayList<Article>
                }
            } else {
                // display errors to the users
                val error = response.errorBody()
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

