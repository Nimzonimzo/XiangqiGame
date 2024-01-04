package model;

import javafx.scene.image.Image;

public class Chariot extends ChessPiece {
    public Chariot(String imagePath) {
        super(imagePath, "Chariot");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement du Chariot
        return true;
    }
}
