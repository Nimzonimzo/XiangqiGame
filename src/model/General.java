package model;

import javafx.scene.image.Image;

public class General extends ChessPiece {
    public General(String imagePath) {
        super(imagePath, "General");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique pour valider le déplacement du General
        return true;
    }
}
