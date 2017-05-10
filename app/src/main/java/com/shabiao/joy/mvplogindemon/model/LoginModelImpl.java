package com.shabiao.joy.mvplogindemon.model;

import com.shabiao.joy.mvplogindemon.view.LoginView;

/**
 * Created by joy on 2017/3/8.
 */

public class LoginModelImpl implements LoginModel {
    String account = "123456";
    String password = "123456";
    public LoginModelImpl() {
    }

    @Override
    public void login(String account, String password, LoginView loginView) {
        if(account.isEmpty()){
            loginView.accountNotEmpty();
            return;
        }

        if(password.isEmpty()){
            loginView.passwordNotEmpty();
            return;
        }

        if(!account.equals(this.account)){
            loginView.accountNotExist();
            return;
        }

        if(!account.equals(this.account)||!password.equals(this.password)){
            loginView.passwordError();
        }else {
            loginView.loginSuccess();
        }
    }
}
