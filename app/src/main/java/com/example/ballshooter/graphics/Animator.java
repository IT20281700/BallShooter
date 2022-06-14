package com.example.ballshooter.graphics;

import android.graphics.Canvas;

import com.example.ballshooter.gameobject.Player;
import com.example.ballshooter.gamepanel.GameDisplay;

public class Animator {
    private Sprite[] playerSpriteArray;
    private int indexNotMovingFrame = 0;
    private int indexMovingFrame = 1;
    private int updateBeforeNextMoveFrame;
    private int MAX_UPDATES_BEFORE_NEXT_MOVE_FRAME = 5;

    public Animator(Sprite[] playerSpriteArray) {
        this.playerSpriteArray = playerSpriteArray;
    }

    public void draw(Canvas canvas, GameDisplay gameDisplay, Player player) {
        switch (player.getPlayerState().getState()) {
            case NOT_MOVING:
                drawFrame(canvas, gameDisplay, player, playerSpriteArray[indexNotMovingFrame]);
                break;
            case STARED_MOVING:
                updateBeforeNextMoveFrame = MAX_UPDATES_BEFORE_NEXT_MOVE_FRAME;
                drawFrame(canvas, gameDisplay, player, playerSpriteArray[indexMovingFrame]);
                break;
            case IS_MOVING:
                drawFrame(canvas, gameDisplay, player, playerSpriteArray[indexMovingFrame]);
                updateBeforeNextMoveFrame--;
                if (updateBeforeNextMoveFrame == 0) {
                    updateBeforeNextMoveFrame = MAX_UPDATES_BEFORE_NEXT_MOVE_FRAME;
                    toggleIndexMovingFrame();
                }
                break;
            default:
                break;
        }
    }

    private void toggleIndexMovingFrame() {
        if(indexMovingFrame == 1) {
            indexMovingFrame = 2;
        }
        else {
            indexMovingFrame = 1;
        }
    }

    public void drawFrame(Canvas canvas, GameDisplay gameDisplay, Player player, Sprite sprite) {
        sprite.draw(
                canvas,
                (int) gameDisplay.gameToDisplayCoordinatesX(player.getPositionX()) - sprite.getWidth()/2,
                (int) gameDisplay.gameToDisplayCoordinatesY(player.getPositionY()) - sprite.getHeight()/2
        );
    }

}
