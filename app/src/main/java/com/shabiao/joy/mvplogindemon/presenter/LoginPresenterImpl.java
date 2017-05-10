package com.shabiao.joy.mvplogindemon.presenter;

import com.shabiao.joy.mvplogindemon.model.LoginModel;
import com.shabiao.joy.mvplogindemon.model.LoginModelImpl;
import com.shabiao.joy.mvplogindemon.view.LoginView;

/**
 * Created by joy on 2017/3/8.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginView{
    //引用的是View的接口，达到松耦合的目的
    private LoginView loginView;

    //引用的是model的接口，达到松耦合的目的
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl();
    }

    @Override
    public void login(String account,String password) {
        loginModel.login(account,password,this);
    }

    @Override
    public void destroy() {
        //
    }

    @Override
    public void passwordError() {
        loginView.passwordError();
    }

    @Override
    public void accountNotExist() {
        loginView.accountNotExist();
    }

    @Override
    public void passwordNotEmpty() {
        loginView.passwordNotEmpty();
    }

    @Override
    public void accountNotEmpty() {
        loginView.accountNotEmpty();
    }

    @Override
    public void loginSuccess() {
        loginView.loginSuccess();
    }
}
