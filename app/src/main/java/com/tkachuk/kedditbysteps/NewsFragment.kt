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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.fragment_news)
        news_list.setHasFixedSize(true) //this setting improve performance
        news_list.layoutManager = LinearLayoutManager(context)

        return view
    }
}