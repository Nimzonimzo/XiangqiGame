package model;

public class Elephant extends ChessPiece {
    public Elephant() {
        super("images/ElephantRed.png", "Elephant");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour l'elephant
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}