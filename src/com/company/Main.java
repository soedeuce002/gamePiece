package com.company;

public class Main {

    public static void main(String[] args) {

        GamePiece piece1 = new GamePiece();



        piece1.move(4, 4);
        piece1.freeze();
        piece1.unfreeze();
        piece1.move(9, 7);
        piece1.freeze();
        piece1.move(5,6);
        piece1.unfreeze();
        piece1.move(5, 6);
    }
}
