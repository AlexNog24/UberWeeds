package org.academiadecodigo.sshpecials.gameObjects.Wall;


import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.testing.Inventory;

/**
 * Wall that will block Upper limit of walking area
 */
public class BasementUpWall extends GameObject {

    private static int LEFT_LIMIT_X = -30;
    private static int RIGHT_LIMIT_X = 920;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 175;

    public BasementUpWall(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);

    }


    @Override
    public String toString() {
        return "IM UP WALL";
    }
}
