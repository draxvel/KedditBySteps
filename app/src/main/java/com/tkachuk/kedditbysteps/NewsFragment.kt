package com.tkachuk.kedditbysteps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tkachuk.kedditbysteps.commons.adapter.NewsAdapter
import com.tkachuk.kedditbysteps.commons.RedditNewsItem
import com.tkachuk.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment: Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        initAdapter()

        if(savedInstanceState == null){
            val news = mutableListOf<RedditNewsItem>()
            for(i in 1..10){
                news.add(RedditNewsItem("author$i", "title$i",
                        i,
                        32324234234,
                            "https://picsum.photos/200/200?image=$i", "url$i"))
            }
            (news_list.adapter as NewsAdapter).addNews(news)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.fragment_news)
        return view
    }

    private fun initAdapter(){
        if(news_list.adapter == null){
            news_list.adapter = NewsAdapter()
        }
    }
}