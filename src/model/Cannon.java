package model;

public class Cannon extends ChessPiece {
    public Cannon(String imagePath) {
        super(imagePath, "Cannon");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour le Cannon
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
