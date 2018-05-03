package com.xzh.kingtv.mvp.base;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.king.base.util.LogUtils;
import com.xzh.kingtv.App;
import com.xzh.kingtv.dao.greendao.DaoSession;
import com.xzh.kingtv.di.component.AppComponent;


import javax.inject.Inject;



public class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

    private App app;

    private DaoSession mDaoSession;

    private AppComponent mAppComponent;

    @Inject
    public BasePresenter(App app){
        super();
        this.app = app;
        mDaoSession = app.getDaoSession();
        mAppComponent = app.getAppCommponent();
    }


    public AppComponent getAppComponent(){
        return mAppComponent;
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }

    public App getApp(){
        return getApp();
    }

    @Override
    public boolean isViewAttached() {
        LogUtils.d("isViewAttached:" + super.isViewAttached());
        return super.isViewAttached();
    }
}
