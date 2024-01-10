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
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour l'advisor
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
