package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetStoreDownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetStoreLeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetStoreRightWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetStoreUpWall;

public class StreetStore extends Scenery{

    private static String PICTURE = "Resources/streetStore.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = { new StreetStoreUpWall()};
    //Array of objects that can colide with character in this scenery


    public StreetStore() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background pictu
    }
}
