package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;


    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int newPositionX, int newPositionY) {
        if(!this.frozen){
            this.positionX = newPositionX;
            this.positionY = newPositionY;
            System.out.println("position X: " + positionX);
            System.out.println("position Y: " + positionY);
        }
    }

    public void freeze(){
        this.frozen = true;

        System.out.println("The piece is frozen. The unfreeze method must be called in order to move the piece again.");
    }

    public void unfreeze() {
        this.frozen = false;
        System.out.println("You may now move the piece.  Please specify new position values.");

    }
}
