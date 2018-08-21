package com.tkachuk.kedditbysteps.commons

import com.tkachuk.kedditbysteps.commons.adapter.util.ViewType
import com.tkachuk.kedditbysteps.commons.adapter.util.AdapterConstants

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}