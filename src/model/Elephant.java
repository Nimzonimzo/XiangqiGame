package model;

public class Elephant extends ChessPiece {
    public Elephant(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Elephant(String color) {
        super("/images/Elephant" + color + ".png", "Elephant");
    }

    // Ajoutez ce constructeur par défaut
    public Elephant() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour l'éléphant
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
