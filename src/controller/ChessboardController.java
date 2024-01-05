package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessboardController {

    @FXML
    private GridPane chessboardGrid;

    @FXML
    private void initialize() {
        initializeChessboard();
    }

    public void initializeChessboard() {
        int numColumns = 8;
        int numRows = 9; // Inclut la rivière

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Rectangle square = new Rectangle(50, 50);

                // Couleur alternée pour les cases à modifier plus tard
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.BLACK);
                }

                // Ajout d'une bordure
                square.setStroke(Color.BLACK);

                // Ajout de la rivière comme un unique rectangle bleu
                if (row == numRows / 2) {
                    square.setFill(Color.LIGHTBLUE);
                    square.setStroke(Color.BLACK); // Ajoute une bordure à la rivière
                    GridPane.setColumnSpan(square, numColumns); // Étend le rectangle sur toute la largeur
                }

                chessboardGrid.add(square, col, row);
            }
        }
    }
}
