package model;

public class Horse extends ChessPiece {
    public Horse(String imagePath) {
        super(imagePath, "Horse");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour le Horse
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
