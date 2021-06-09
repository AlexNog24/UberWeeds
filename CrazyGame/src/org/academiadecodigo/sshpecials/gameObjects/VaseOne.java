package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.testing.Vase;
import org.academiadecodigo.sshpecials.gameObjects.vaseState.VaseOneStateType;
import java.util.Date;
public class VaseOne extends Vase {

    private static VaseOneStateType vaseState = VaseOneStateType.NO_VASE; //It has a type from VaseSatateType Enum, starts with the inicial state (with a slot where u can place vase)
    private static int LEFT_LIMIT_X = 485;
    private static int RIGHT_LIMIT_X = 665;
    private static int UP_LIMIT_Y = 210;
    private static int DOWN_LIMIT_Y = 260;

    private int startingTime;
    private int finishingTime;

    private boolean threadCreated;
    private Thread t1;
    private Picture picture;
    public VaseOne() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, vaseState.x, vaseState.y, vaseState.picturePath);
        vaseState = VaseOneStateType.NO_VASE;
        threadCreated = false;
        this.picture = super.getPicture();
    }

    /**
     * Vase has a vaseState from various states it can be, and each time we interact with vase, if it has the correct ingredients, it will
     * jump to the next state and change its model on the screen. When it reaches the last fase and we collect the weed, it will go back to state 2, where
     * the vase is ready to plant again.
     */

    /*public void createThread() {

        t1 = new Thread(new VaseOne ());
        t1.start();
    }
    @Override
    public void run() {
        changeState();
    }*/
     @Override
    public void changePicture(int x, int y, String picturePath) {

        System.out.println("changing pic of Vasee!");

    }

    @Override
    public void changeState() {
        switch(vaseState) {
            case  NO_VASE:
                vaseState = VaseOneStateType.EMPTY_VASE;

                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            case EMPTY_VASE:
                vaseState = VaseOneStateType.VASE_READY_FOR_SEEDS;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            case VASE_READY_FOR_SEEDS:
                vaseState = VaseOneStateType.VASE_HAS_SEEDS;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            case VASE_HAS_SEEDS:
                vaseState = VaseOneStateType.VASE_HAS_WATER;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            case VASE_HAS_WATER:
                vaseState = VaseOneStateType.VASE_IS_COLLECTABLE;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            default:
                vaseState = VaseOneStateType.EMPTY_VASE;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
        }
    }

    public void setThread(Thread thread) {
       // this.thread = thread;
    }
    @Override
    public String toString() {
        return "IM A VASE!";
    }
}
