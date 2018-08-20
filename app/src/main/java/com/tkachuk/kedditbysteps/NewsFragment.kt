package com.tkachuk.kedditbysteps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tkachuk.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment: Fragment() {

    private val newsList by lazy {
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        news_list // this will work as the return type
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.fragment_news)
        return view
    }
}