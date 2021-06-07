package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.GameObject;

public class Scenery {

    private Picture picture;
    private GameObject[] gameObjects;
    private boolean available;

    /**
     *
     * Scenery receives the list of objects in that scenery for check colision with character in the future, and a path for its model on screen
     */
    public Scenery(String picPath, GameObject[] gameObjects) {
        picture = new Picture(0, 0, picPath);
        picture.draw();
        available = true;
        this.gameObjects = gameObjects;


        gameObjects[0].getPicture().delete();
        gameObjects[0].getPicture().draw();
    }

    public GameObject[] getGameObjects() {
        return gameObjects;
    }
}