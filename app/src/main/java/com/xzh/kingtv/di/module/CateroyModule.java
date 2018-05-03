package com.xzh.kingtv.di.module;



import com.xzh.kingtv.App;
import com.xzh.kingtv.di.scope.FragmentScope;
import com.xzh.kingtv.mvp.presenter.CategoryPresenter;

import dagger.Module;
import dagger.Provides;



@Module
public class CateroyModule {

    private App app;
    public CateroyModule(App app){
        this.app = app;
    }

    @FragmentScope
    @Provides
    public CategoryPresenter provideCateroyPresenter(){
        return new CategoryPresenter(app);
    }


}
