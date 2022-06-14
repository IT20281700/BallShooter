package com.example.ballshooter.gamepanel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import androidx.core.content.ContextCompat;

import com.example.ballshooter.Game;
import com.example.ballshooter.R;

/**
 * GameOver is a panel which draws the text Game Over to the screen.
 */
public class GameOver {

    private final Game game;
    private Context context;
    private Paint paint = new Paint();

    public GameOver(Context context, Game game) {
        this.context = context;
        this.game = game;
    }

    public void draw(Canvas canvas) {
        String text = "Game Over";

        float x = getXforCenteredText(text);
        float y = game.SCREEN_HEIGHT/2;


        int color = ContextCompat.getColor(context, R.color.gameOver);
        paint.setColor(color);
        float textSize = 150;
        paint.setTextSize(textSize);
        canvas.drawText(text, x, y, paint);
    }

    public int getXforCenteredText(String text) {

        Rect bounds = new Rect();
        paint.getTextBounds(text, 0, text.length(), bounds);
        int x = game.SCREEN_WIDTH / 2 - bounds.width() / 2;
        return x;

    }

}
