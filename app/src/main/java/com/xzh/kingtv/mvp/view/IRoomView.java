package com.xzh.kingtv.mvp.view;


import com.xzh.kingtv.bean.Room;
import com.xzh.kingtv.mvp.base.BaseView;

public interface IRoomView extends BaseView {

    void enterRoom(Room room);
    void playUrl(String url);

}
