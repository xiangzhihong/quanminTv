package com.xzh.kingtv.mvp.activity;

import android.view.animation.Animation;

import com.king.base.SplashActivity;
import com.xzh.kingtv.MainActivity;
import com.xzh.kingtv.R;


public class WelcomeActivity extends SplashActivity {
    @Override
    public int getContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public Animation.AnimationListener getAnimationListener() {
        return new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivityFinish(MainActivity.class);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };
    }
}
