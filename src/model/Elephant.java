package model;

import javafx.scene.image.Image;

public class Elephant extends ChessPiece {
    public Elephant(String imagePath) {
        super(imagePath, "Elephant");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement de l'Elephant
        return true;
    }
}
