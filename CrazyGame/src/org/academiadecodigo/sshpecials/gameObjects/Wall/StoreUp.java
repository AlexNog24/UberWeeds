package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StoreUp extends Wall {

    private static int LEFT_LIMIT_X = -50;
    private static int RIGHT_LIMIT_X = 850;
    private static int UP_LIMIT_Y = 3;
    private static int DOWN_LIMIT_Y = 247;

    public StoreUp(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}
