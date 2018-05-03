package com.xzh.kingtv.di.module;

import android.content.Context;


import com.xzh.kingtv.App;
import com.xzh.kingtv.http.APIService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class AppModule {
    /**
     *  默认超时时间 单位/秒
     */
    private static final int DEFAULT_TIME_OUT = 10;

    private Context context;

    private String baseUrl;

    public AppModule(App context, String baseUrl){
        this.context = context;
        this.baseUrl = baseUrl;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
   public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(provideOkHttpClient())
                .build();
    }

    @Provides
    @Singleton
   public OkHttpClient provideOkHttpClient(){

        return new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    public APIService provideAPIService(){
        return provideRetrofit().create(APIService.class);
    }
}
