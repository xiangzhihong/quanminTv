package com.xzh.kingtv.di.module;



import com.xzh.kingtv.App;
import com.xzh.kingtv.di.scope.FragmentScope;
import com.xzh.kingtv.mvp.presenter.LiveListPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class LiveListModule {

    private App app;

    public LiveListModule(App app){
        this.app = app;
    }

    @FragmentScope
    @Provides
    public LiveListPresenter provideLiveListPresenter(){
        return new LiveListPresenter(app);
    }

}
