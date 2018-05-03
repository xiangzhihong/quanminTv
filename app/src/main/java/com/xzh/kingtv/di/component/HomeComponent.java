package com.xzh.kingtv.di.component;



import com.xzh.kingtv.di.module.CateroyModule;
import com.xzh.kingtv.di.module.LiveListModule;
import com.xzh.kingtv.di.scope.FragmentScope;
import com.xzh.kingtv.mvp.fragment.HomeFragment;
import com.xzh.kingtv.mvp.fragment.LiveListFragment;
import com.xzh.kingtv.mvp.presenter.CategoryPresenter;
import com.xzh.kingtv.mvp.presenter.LiveListPresenter;

import dagger.Component;



@FragmentScope
@Component(modules = {CateroyModule.class,LiveListModule.class},dependencies = AppComponent.class)
public interface HomeComponent {

    void inject(HomeFragment homeFragment);
    void inject(LiveListFragment liveListFragment);

    CategoryPresenter getCateroyPresenter();

    LiveListPresenter getLiveListPresenter();

}
