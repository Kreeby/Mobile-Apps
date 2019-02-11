package com.example.acerpc.test;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;

class ScaleAnimToHide extends ScaleAnimation {

    private View mView;

    private ConstraintLayout.LayoutParams mLayoutParams;

    private int mMarginBottomFromY, mMarginBottomToY;

    private boolean mVanishAfter = false;

    ScaleAnimToHide(float fromX, float toX, float fromY, float toY, int duration, View view, boolean vanishAfter) {
        super(fromX, toX, fromY, toY);
        setDuration(duration);
        mView = view;
        mVanishAfter = vanishAfter;
        mLayoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int height = mView.getHeight();
        mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin - height;
        mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) - height;

    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        if (interpolatedTime < 1.0f) {
            int newMarginBottom = mMarginBottomFromY + (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime);
            mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin, mLayoutParams.rightMargin, newMarginBottom);
            mView.getParent().requestLayout();
            //Log.v("CZ","newMarginBottom..." + newMarginBottom + " , mLayoutParams.topMargin..." + mLayoutParams.topMargin);
        } else if (mVanishAfter) {
            mView.setVisibility(View.GONE);
        }
    }
}

class ScaleAnimToShow extends ScaleAnimation {

    private View mView;

    private LinearLayout.LayoutParams mLayoutParams;

    private int mMarginBottomFromY, mMarginBottomToY;

    private boolean mVanishAfter = false;

    ScaleAnimToShow(float toX, float fromX, float toY, float fromY, int duration, View view, boolean vanishAfter) {
        super(fromX, toX, fromY, toY);
        setDuration(duration);
        mView = view;
        mVanishAfter = vanishAfter;
        mLayoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        mView.setVisibility(View.VISIBLE);
        int height = mView.getHeight();
        //mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin + height;
        //mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) + height;

        mMarginBottomFromY = 0;
        mMarginBottomToY = height;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        if (interpolatedTime < 1.0f) {
            int newMarginBottom = (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime) - mMarginBottomToY;
            mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin, mLayoutParams.rightMargin, newMarginBottom);
            mView.getParent().requestLayout();

        }
    }

}
