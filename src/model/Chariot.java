package model;

public class Chariot extends ChessPiece {
    public Chariot(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Chariot(String color) {
        super("/images/Chariot" + color + ".png", "Chariot");
    }

    // Ajoutez ce constructeur par défaut
    public Chariot() {
        super("/images/ChariotRed.png", "Chariot");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Mouvement valide pour le Chariot : se déplace en ligne droite
        if (sourceRow == targetRow || sourceCol == targetCol) {
            // Déplacement en ligne droite
            return true;
        }

        return false;
    }
}
