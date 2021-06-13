package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class AlleyRight extends Wall {

    private static int LEFT_LIMIT_X = 660;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = -9;
    private static int DOWN_LIMIT_Y = 450;

    public AlleyRight(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

}
