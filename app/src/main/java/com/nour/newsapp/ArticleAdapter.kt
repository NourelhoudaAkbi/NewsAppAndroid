package com.nour.newsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ArticleAdapter (
    val context: Context,
    var data: ArrayList<Article>,

    ) : RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(
            LayoutInflater.from(context).inflate(R.layout.article_row, parent, false)
        )
    }


    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.articleTitle.text = data[position].title
        holder.articleDescription.text = data[position].description
        holder.articleSource.text = data[position].source_name
        Glide.with(context).load(data[position].image_url).into(holder.articleImage)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}


