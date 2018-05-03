package com.xzh.kingtv.mvp.view;


import com.xzh.kingtv.bean.LiveInfo;
import com.xzh.kingtv.mvp.base.BaseView;

import java.util.List;

public interface ILiveListView extends BaseView {


    void onGetLiveList(List<LiveInfo> list);
    void onGetMoreLiveList(List<LiveInfo> list);

}
