package com.shabiao.joy.mvplogindemon.presenter;

/**
 * Created by joy on 2017/3/8.
 */

public interface LoginPresenter {
    void login(String account,String password);

    void destroy();
}
