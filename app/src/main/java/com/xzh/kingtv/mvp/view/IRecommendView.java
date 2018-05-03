package com.xzh.kingtv.mvp.view;


import com.xzh.kingtv.bean.Banner;
import com.xzh.kingtv.bean.Recommend;
import com.xzh.kingtv.mvp.base.BaseView;

import java.util.List;



public interface IRecommendView extends BaseView {

    void onGetRecommend(Recommend recommend);

    void onGetRooms(List<Recommend.RoomBean> list);

    void onGetBanner(List<Banner> list);
}
