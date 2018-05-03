package com.xzh.kingtv.mvp.fragment;

import android.os.Bundle;

import com.xzh.kingtv.R;


public class RankFragment extends SimpleFragment {

    public static RankFragment newInstance() {

        Bundle args = new Bundle();

        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_rank;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }
}
