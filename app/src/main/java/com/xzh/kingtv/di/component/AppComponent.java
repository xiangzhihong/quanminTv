package com.xzh.kingtv.di.component;

import android.content.Context;


import com.xzh.kingtv.App;
import com.xzh.kingtv.di.module.AppModule;
import com.xzh.kingtv.http.APIService;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;


@Singleton
@Component(modules= AppModule.class)
public interface AppComponent {

    void inject(App app);

    Context getContext();

    Retrofit getRetrofit();

    OkHttpClient getOkHttpClient();

    APIService getAPIService();

}
