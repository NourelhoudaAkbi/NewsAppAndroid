package com.nour.newsapp


data class NewsResponse(
    val status: String,
    val results: List<Article>
)

data class Article(
    val title: String,
    val description: String,
    val link: String,
    val pubDate: String,
    val source_name: String,
    val image_url: String?
)
