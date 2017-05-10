package com.shabiao.joy.mvplogindemon.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.shabiao.joy.mvplogindemon.R;

public class ViewActivity extends AppCompatActivity {
    private static final String TAG = "view_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        BasisCustomizeView basisView = (BasisCustomizeView) findViewById(R.id.basis_view);
        Log.e(TAG,basisView.getRight()+","+basisView.getBottom());
    }
}
