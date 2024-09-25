package com.nour.newsapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val articleImage : ImageView = itemView.findViewById(R.id.articleImgId)
    val articleTitle : TextView = itemView.findViewById(R.id.articleTitleId)
    val articleDescription : TextView = itemView.findViewById(R.id.articledescid)
    val articleSource : TextView = itemView.findViewById(R.id.articleSourceId)

}