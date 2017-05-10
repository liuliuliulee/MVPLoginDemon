package com.shabiao.joy.mvplogindemon.model;

import com.shabiao.joy.mvplogindemon.view.LoginView;

/**
 * Created by joy on 2017/3/8.
 */

public interface LoginModel {
    void login(String account, String password, LoginView loginView);
}
