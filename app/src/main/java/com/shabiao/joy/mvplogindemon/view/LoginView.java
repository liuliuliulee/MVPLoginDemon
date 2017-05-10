package com.shabiao.joy.mvplogindemon.view;

/**
 * Created by joy on 2017/3/8.
 */

public interface LoginView {
    void passwordError();
    void accountNotExist();
    void passwordNotEmpty();
    void accountNotEmpty();
    void loginSuccess();
}
