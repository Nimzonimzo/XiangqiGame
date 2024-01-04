package model;

import javafx.scene.image.Image;

public class Advisor extends ChessPiece {
    public Advisor(String imagePath) {
        super(imagePath, "Advisor");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement de l'Advisor
        return true;
    }
}
