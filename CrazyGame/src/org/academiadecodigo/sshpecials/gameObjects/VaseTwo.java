package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.sshpecials.gameObjects.vaseState.VaseOneStateType;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;
import org.academiadecodigo.sshpecials.testing.Vase;
import org.academiadecodigo.sshpecials.gameObjects.vaseState.VaseTwoStateType;

public class VaseTwo extends Vase {
    private static VaseTwoStateType vaseState = VaseTwoStateType.NO_VASE; //It has a type from VaseSatateType Enum, starts with the inicial state (with a slot where u can place vase)
    private static int LEFT_LIMIT_X = 515;
    private static int RIGHT_LIMIT_X = 572;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 205;

    public VaseTwo() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, vaseState.x, vaseState.y, vaseState.picturePath);
        vaseState = VaseTwoStateType.NO_VASE;
    }

    /**
     * Vase has a vaseState from various states it can be, and each time we interact with vase, if it has the correct ingredients, it will
     * jump to the next state and change its model on the screen. When it reaches the last fase and we collect the weed, it will go back to state 2, where
     * the vase is ready to plant again.
     */
    @Override
    public void changeState(Inventory inventory) {
        switch(vaseState) {
            case  NO_VASE:
                if(inventory.hasItem(ItemType.VASE)) {
                    inventory.remove(ItemType.VASE, 1);
                    vaseState = VaseTwoStateType.EMPTY_VASE;
                    super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                }
                break;
            case EMPTY_VASE:
                if(inventory.hasItem(ItemType.SHOVEL)) {
                    vaseState = VaseTwoStateType.VASE_READY_FOR_SEEDS;
                    super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                }
                break;
            case VASE_READY_FOR_SEEDS:
                if(inventory.keyCount(ItemType.WEED_SEEDS) >= 10) {
                    inventory.remove(ItemType.WEED_SEEDS, 10);
                    vaseState = VaseTwoStateType.VASE_HAS_SEEDS;
                    super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                }
                break;
            case VASE_HAS_SEEDS:
                if(inventory.hasItem(ItemType.WATER_CAN)) {
                    vaseState = VaseTwoStateType.VASE_HAS_WATER;
                    super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                }
                break;
            case VASE_HAS_WATER:
                vaseState = VaseTwoStateType.VASE_IS_COLLECTABLE;
                super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                break;
            default:
                if(inventory.hasItem(ItemType.SCISSORS)) {
                    inventory.add(ItemType.WEED_BAGS, 50);
                    vaseState = VaseTwoStateType.EMPTY_VASE;
                    super.changePicture(vaseState.x, vaseState.y, vaseState.picturePath);
                }

                break;
        }
    }

    @Override
    public String toString() {
        return "IM A VASE!";
    }
}

