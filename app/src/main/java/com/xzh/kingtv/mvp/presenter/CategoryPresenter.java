package com.xzh.kingtv.mvp.presenter;

import com.king.base.util.LogUtils;
import com.xzh.kingtv.App;
import com.xzh.kingtv.bean.LiveCategory;
import com.xzh.kingtv.mvp.base.BasePresenter;
import com.xzh.kingtv.mvp.view.ICategoryView;
import com.xzh.kingtv.thread.ThreadPoolManager;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



public class CategoryPresenter extends BasePresenter<ICategoryView> {

    @Inject
    public CategoryPresenter(App app) {
        super(app);
    }

    public void getAllCategories(){
        getView().showProgress();
        getAppComponent().getAPIService()
                .getAllCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<LiveCategory>>() {
                    @Override
                    public void onCompleted() {
                        if(isViewAttached())
                            getView().onCompleted();

                    }

                    @Override
                    public void onError(Throwable e) {
                        if(isViewAttached())
                            getView().onError(e);
                    }

                    @Override
                    public void onNext(final List<LiveCategory> list) {
                        LogUtils.d("Response:" + list);

                        ThreadPoolManager.getInstance().execute(new Runnable() {
                            @Override
                            public void run() {
                                getDaoSession().getLiveCategoryDao().insertOrReplaceInTx(list);
                            }
                        });
                        if(isViewAttached())
                            getView().onGetLiveCategory(list);

                    }
                });
    }

    public void getAllCategoriesByDB(){
        List<LiveCategory> list =  getDaoSession().getLiveCategoryDao().loadAll();
        LogUtils.d("list:" + list);
        if(list!=null && list.size()>0){
            if(isViewAttached())
                getView().onGetLiveCategory(list);
        }

    }


}
