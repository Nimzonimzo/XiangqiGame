package model;

public class Elephant extends ChessPiece {
    public Elephant(String imagePath) {
        super(imagePath, "Elephant");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour l'Elephant
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}
