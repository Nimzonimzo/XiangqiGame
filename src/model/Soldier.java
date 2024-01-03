package model;

public class Soldier extends ChessPiece {
    public Soldier(String imagePath) {
        super(imagePath, "Soldier");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour le Soldier
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
