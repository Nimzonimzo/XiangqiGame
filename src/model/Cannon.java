package model;

import javafx.scene.image.Image;

public class Cannon extends ChessPiece {
    public Cannon(String imagePath) {
        super(imagePath, "Cannon");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement du Cannon
        return true;
    }
}
