package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.VaseOne;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementDownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementLeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementUpWall;

public class MainMenuStartOption extends Scenery {

    private static String PICTURE = "Resources/StartGameOptionMenu.png";

    public MainMenuStartOption() {
        super(PICTURE);
    }

    @Override
    public String toString() {
        return "IM IN A MAINMENU";

    }

    @Override
    public GameObject[] getGameObjects() {
        return null;
    }
}
