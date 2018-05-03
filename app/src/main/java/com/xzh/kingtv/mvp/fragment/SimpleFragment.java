package com.xzh.kingtv.mvp.fragment;


import com.xzh.kingtv.mvp.base.BaseFragment;
import com.xzh.kingtv.mvp.base.BasePresenter;
import com.xzh.kingtv.mvp.base.BaseView;

public abstract class SimpleFragment extends BaseFragment<BaseView,BasePresenter<BaseView>> {

    @Override
    public BasePresenter<BaseView> createPresenter() {
        return new BasePresenter<>(getApp());
    }
}
