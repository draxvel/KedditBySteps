package com.tkachuk.kedditbysteps.features

import com.tkachuk.kedditbysteps.commons.RedditNewsItem
import rx.Observable

class NewsManager {
    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create { subscriber ->
            val news = mutableListOf<RedditNewsItem>()

            for (i in 1..10) {
                news.add(RedditNewsItem("author$i", "title$i",
                        i,
                        32324234234,
                        "https://picsum.photos/200/200?image=$i", "url$i"))
            }
            subscriber.onNext(news)
        }
    }
}