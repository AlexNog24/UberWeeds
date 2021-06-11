package org.academiadecodigo.sshpecials.gameObjects.vaseState;

public enum VaseOneStateType {

    /**
     * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
     * to show on the screen at the correct place.
     */
    NO_VASE(400, 272, "Resources/vasoSlot2.PNG"),
    EMPTY_VASE(400, 212,  "Resources/EmptyVase2.PNG"),
    VASE_READY_FOR_SEEDS(400, 192, "Resources/VaseReadyForSeeds2.PNG"),
    VASE_HAS_SEEDS(400, 192, "Resources/VaseHasSeeds.png"),
    VASE_HAS_WATER(400, 160, "Resources/VaseHasWater.png"),
    VASE_IS_COLLECTABLE(400, 156, "Resources/VaseIsCollectable.png");

    public int x;
    public int y;

    public String picturePath;

    VaseOneStateType(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
