package com.example.ballshooter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * MainActivity is the entry point to our application
 */
public class MainActivity extends Activity {

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Game.java", "onCreate()");
        super.onCreate(savedInstanceState);

        // Set content view to game, so that objects in the Game class can be rendered to the screen
        game = new Game(this);
        setContentView(game);

    }

    @Override
    protected void onStart() {
        Log.d("Game.java", "onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("Game.java", "onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("Game.java", "onPause()");
        game.pause();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("Game.java", "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Game.java", "onDestroy()");
        super.onDestroy();
    }
}