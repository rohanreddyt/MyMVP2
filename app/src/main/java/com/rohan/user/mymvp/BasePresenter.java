package com.rohan.user.mymvp;

/**
 * Created by User on 11/22/2016.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();

}
