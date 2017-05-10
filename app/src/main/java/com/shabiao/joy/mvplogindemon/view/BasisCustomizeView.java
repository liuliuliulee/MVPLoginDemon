package com.shabiao.joy.mvplogindemon.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by joy on 2017/3/31.
 */

public class BasisCustomizeView extends View {

    Paint paint;

    public BasisCustomizeView(Context context) {
        super(context);
        init();
    }

    public BasisCustomizeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BasisCustomizeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int width;
        int height;
        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
        } else {
//            mPaint.setTextSize(mTitleTextSize);
//            mPaint.getTextBounds(mTitle, 0, mTitle.length(), mBounds);
//            float textWidth = mBounds.width();
//            int desired = (int) (getPaddingLeft() + textWidth + getPaddingRight());
            width = 600;
        }

        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else {
//            mPaint.setTextSize(mTitleTextSize);
//            mPaint.getTextBounds(mTitle, 0, mTitle.length(), mBounds);
//            float textHeight = mBounds.height();
//            int desired = (int) (getPaddingTop() + textHeight + getPaddingBottom());
            height = 600;
        }


        setMeasuredDimension(width, height);
//        Log.e("view", getRight() + "," + getBottom());
    }


    @Override
    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        Rect rect = new Rect();
//        rect.set(100, 100, 100, 100);
//        canvas.drawRect(rect, paint);
        canvas.drawColor(Color.GREEN);
        paint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, 100, 100, paint);
        Log.e("view", "on draw");
        paint.setColor(Color.CYAN);
        canvas.drawCircle(200,200,100,paint);


    }
}
