package com.fawns.app.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.fawns.app.R;
import com.fawns.app.ui.base.BaseActivity;
import com.fawns.app.ui.base.BaseSwipeBackActivity;
import com.obsessive.library.eventbus.EventCenter;
import com.obsessive.library.netstatus.NetUtils;

/**
 * Project Fawns
 * Package com.fawns.app.ui.activity
 * Author Mengjiaxin
 * Date 2016/4/20 21:35
 * Desc 请用一句话来描述作用
 */
public class MessageActivity extends BaseSwipeBackActivity {

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    @Override
    protected String setToolbarTitle() {
        return getString(R.string.menu_message);
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_message;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return true;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.RIGHT;
    }
}