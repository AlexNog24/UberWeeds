package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StreetStoreUpWall extends Wall {

    private static int LEFT_LIMIT_X = 847;
    private static int RIGHT_LIMIT_X = -12;
    private static int UP_LIMIT_Y = -10;
    private static int DOWN_LIMIT_Y = 292;

    public StreetStoreUpWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}