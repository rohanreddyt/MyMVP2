package com.rohan.user.mymvp.presenter;

import com.rohan.user.mymvp.BasePresenter;
import com.rohan.user.mymvp.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public interface MainMvpPresenter extends BasePresenter<MainView> {
     void loadData();
}
