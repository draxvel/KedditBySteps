package com.tkachuk.kedditbysteps.features

import com.tkachuk.kedditbysteps.api.RestApi
import com.tkachuk.kedditbysteps.commons.RedditNews
import com.tkachuk.kedditbysteps.commons.RedditNewsItem
import rx.Observable

class NewsManager(private val api: RestApi = RestApi()) {

    /**
     * Returns Reddit News paginated by the given limit.
     *
     * @param after indicates the next page to navigate.
     * @param limit the number of news to request.
     */

    fun getNews(after: String, limit: String = "10"): Observable<RedditNews> {
        return Observable.create {
            subscriber ->
            val response = api.getNews(after, limit).execute()

            if (response.isSuccessful) {
                val dataResponse = response.body().data

                val news = dataResponse.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }

                val redditNews = RedditNews(
                        dataResponse.after ?: "",
                        dataResponse.before ?: "",
                        news)

                subscriber.onNext(redditNews)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}