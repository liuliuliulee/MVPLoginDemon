package com.shabiao.joy.mvplogindemon.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.widget.EditText;
import android.widget.Toast;

import com.shabiao.joy.mvplogindemon.R;
import com.shabiao.joy.mvplogindemon.presenter.LoginPresenter;
import com.shabiao.joy.mvplogindemon.presenter.LoginPresenterImpl;


public class MainActivity extends AppCompatActivity implements LoginView {

    EditText etAccount;
    EditText etPassword;
    AppCompatButton btnLogin;

    //引用的是presenter的接口，达到松耦合的目的
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAccount = (EditText) findViewById(R.id.et_account);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (AppCompatButton) findViewById(R.id.btn_login);
        loginPresenter = new LoginPresenterImpl(this);
        btnLogin.setOnClickListener(v -> {
            loginPresenter.login(etAccount.getText().toString(), etPassword.getText().toString());
        });

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loginPresenter.login(etAccount.getText().toString(), etPassword.getText().toString());
//            }
//        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.destroy();
    }

    @Override
    public void passwordError() {
        Toast.makeText(this, "密码错误，请重新输入！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void accountNotExist() {
        Toast.makeText(this, "帐号不存在！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void passwordNotEmpty() {
        Toast.makeText(this, "密码不能为空！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void accountNotEmpty() {
        Toast.makeText(this, "帐号不能为空！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "登录成功！", Toast.LENGTH_LONG).show();

    }
}
