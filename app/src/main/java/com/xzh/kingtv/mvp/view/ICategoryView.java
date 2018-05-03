package com.xzh.kingtv.mvp.view;


import com.xzh.kingtv.bean.LiveCategory;
import com.xzh.kingtv.mvp.base.BaseView;

import java.util.List;

public interface ICategoryView extends BaseView {

    void onGetLiveCategory(List<LiveCategory> list);

}
