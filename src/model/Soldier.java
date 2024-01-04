package model;

import javafx.scene.image.Image;

public class Soldier extends ChessPiece {
    public Soldier(String imagePath) {
        super(imagePath, "Soldier");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement du Soldier
        return true;
    }
}
