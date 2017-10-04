package com.skpissay.baseproject.screens.fragments;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skpissay.baseproject.R;
import com.skpissay.baseproject.baseclasses.BaseFragment;
import com.skpissay.baseproject.rest.ApiInterface;
import com.skpissay.baseproject.rest.response.BasicResponse;
import com.skpissay.baseproject.screens.presenters.HomePresenter;
import com.skpissay.baseproject.screens.views.HomeView;

import javax.inject.Inject;

import retrofit2.Response;
import rx.Observable;

/**
 * Created by skpissay on 19/07/17.
 */

public class HomeFragment extends BaseFragment implements HomeView {

    @Inject
    HomePresenter mHomeActivityPresenter;

    @Inject
    ApiInterface mApiInterface;

    @Override
    protected void handleUIMessage(Message pObjMessage) {
    }

    @Override
    protected int getLayoutResId() {
        return 0;
    }

    @Override
    protected void initViews(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected String getEmptyTitleText() {
        return null;
    }

    @Override
    protected String getEmptyDescText() {
        return null;
    }

    @Override
    protected int getEmptyImageResource() {
        return 0;
    }

    @Override
    protected View.OnClickListener getErrorButtonClickListener() {
        return null;
    }

    @Override
    protected String getErrorText() {
        return null;
    }

    @Override
    public void onPlaces(Response<BasicResponse> response) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onDeviceDeregistrationFailed() {

    }

    @Override
    public Observable<Response<BasicResponse>> getPlaces(String pAccessToken, Long pPlaceId) {
        return mApiInterface.getPlaces();
    }
}
