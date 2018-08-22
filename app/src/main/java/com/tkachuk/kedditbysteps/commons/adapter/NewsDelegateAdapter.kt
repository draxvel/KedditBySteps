package com.tkachuk.kedditbysteps.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.tkachuk.kedditbysteps.R
import com.tkachuk.kedditbysteps.commons.RedditNewsItem
import com.tkachuk.kedditbysteps.commons.adapter.util.ViewType
import com.tkachuk.kedditbysteps.commons.adapter.util.ViewTypeDelegateAdapter
import com.tkachuk.kedditbysteps.funextension.inflate
import com.tkachuk.kedditbysteps.funextension.loadImg
import com.tkachuk.kedditbysteps.funextension.getTime
import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter: ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            imageView.loadImg(item.thumbnail)
            titleTextView.text = item.title
            nameTextView.text = item.author
            commentsTextView.text = "${item.numComments} comments"
            timeTextView.text = item.created.getTime()
        }
    }
}