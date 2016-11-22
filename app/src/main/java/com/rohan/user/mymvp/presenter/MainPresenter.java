package com.rohan.user.mymvp.presenter;

import com.rohan.user.mymvp.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public class MainPresenter implements MainMvpPresenter {
    MainView mainView;

    @Override
    public void loadData() {
        mainView.showProgress();
        try {
            String fakeData= "FireFlies";
            mainView.showText(fakeData);
        } catch (Exception e) {
            mainView.showError(e.getMessage());
        }
        mainView.hideProgress();
    }

    @Override
    public void attachView(MainView view) {
        this.mainView = view;
    }

    @Override
    public void detachView() {
    mainView = null;
    }
}
