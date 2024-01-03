package model;

public class Advisor extends ChessPiece {
    public Advisor(String imagePath) {
        super(imagePath, "Advisor");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour l'Advisor
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
