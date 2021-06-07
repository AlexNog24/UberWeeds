package org.academiadecodigo.sshpecials.gameObjects;


import org.academiadecodigo.sshpecials.gameObjects.GameObject;

/**
 * Wall that will block Right limit of walking area
 */
public class rightWall extends GameObject {

    private static int LEFT_LIMIT_X = 720;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 1000;

    public rightWall(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    public void changeState(){

    }
    @Override
    public String toString() {
        return "IM RIGHT WALL";
    }
}
