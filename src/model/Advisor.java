package model;

public class Advisor extends ChessPiece {
    public Advisor(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Advisor(String color) {
        super("/images/Advisor" + color + ".png", "Advisor");
    }

    // Ajoutez ce constructeur par défaut
    public Advisor() {
        super("/images/AdvisorRed.png", "Advisor");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Mouvement valide pour l'Advisor : déplacement en diagonale dans la zone du palais
        int rowDiff = Math.abs(targetRow - sourceRow);
        int colDiff = Math.abs(targetCol - sourceCol);

        return (rowDiff == 1 && colDiff == 1); // Déplacement en diagonale d'une case
    }
}
