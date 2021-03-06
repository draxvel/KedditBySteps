package com.tkachuk.kedditbysteps.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.tkachuk.kedditbysteps.R
import com.tkachuk.kedditbysteps.commons.adapter.util.ViewType
import com.tkachuk.kedditbysteps.commons.adapter.util.ViewTypeDelegateAdapter
import com.tkachuk.kedditbysteps.funextension.inflate

class LoadingDelegateAdapter: ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {}

    class TurnsViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)
    )
}