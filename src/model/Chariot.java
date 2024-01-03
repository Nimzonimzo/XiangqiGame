package model;

public class Chariot extends ChessPiece {
    public Chariot(String imagePath) {
        super(imagePath, "Chariot");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour le Chariot
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
