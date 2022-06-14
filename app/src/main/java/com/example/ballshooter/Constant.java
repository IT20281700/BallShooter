package com.example.ballshooter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class Constant {
    private int DISPLAY_WIDTH;
    private int DISPLAY_HEIGHT;

    public Constant(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager()
                .getDefaultDisplay()
                .getMetrics(displayMetrics);

        DISPLAY_WIDTH = displayMetrics.widthPixels;
        DISPLAY_HEIGHT = displayMetrics.heightPixels;

    }

    public int getDisplayWidth() {
        return DISPLAY_WIDTH;
    }

    public int getDisplayHeight() {
        return DISPLAY_HEIGHT;
    }
}
