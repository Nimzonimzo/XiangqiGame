package model;

import javafx.scene.image.Image;

public class Horse extends ChessPiece {
    public Horse(String imagePath) {
        super(imagePath, "Horse");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement du Horse
        return true;
    }
}
