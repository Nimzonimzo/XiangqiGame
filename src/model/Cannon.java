package model;

public class Cannon extends ChessPiece {
    public Cannon(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Cannon(String color) {
        super("/images/Cannon" + color + ".png", "Cannon");
    }

    // Ajoutez ce constructeur par défaut
    public Cannon() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour le cannon
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
