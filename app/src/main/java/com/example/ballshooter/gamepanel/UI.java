package com.example.ballshooter.gamepanel;

import android.content.Context;
import android.gesture.Prediction;
import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.core.content.ContextCompat;

import com.example.ballshooter.Game;
import com.example.ballshooter.R;

public class UI {
    private Context context;
    private Game game;

    public UI(Context context, Game game) {
        this.context = context;
        this.game = game;
    }

    public void draw(Canvas canvas) {
        drawScore(canvas);
    }

    public void drawScore(Canvas canvas) {
        Paint paint = new Paint();
        int color = ContextCompat.getColor(context, R.color.score);
        paint.setColor(color);
        paint.setTextSize(50);
        canvas.drawText("SCORE " + game.score, placeX(1.14), placeY(15), paint);
    }

    private int placeX(double x) {
            return (int) (game.SCREEN_WIDTH/x);
    }

    private int placeY(double y) {
        return (int) (game.SCREEN_HEIGHT/y);
    }

}
