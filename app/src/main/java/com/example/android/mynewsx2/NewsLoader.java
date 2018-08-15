package com.example.android.mynewsx2;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by Person on 11/08/2018.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private String url;


    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
//        if (url == null) {
//            return null;
//        }

        List<News> newsList = QueryUtils.fetchNews(url);
        return newsList;

    }
}