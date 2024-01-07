package controller;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessboardController {

    @FXML
    private GridPane chessboardGrid;

    @FXML
    private void initialize() {
        initializeChessboard();
        displayImage(); // Ajout de cette ligne pour afficher l'image de test
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

                // Ajout de la rivière comme un unique rectangle bleu mais la en carré
                if (row == numRows / 2) {
                    square.setFill(Color.LIGHTBLUE);
                    square.setStroke(Color.BLACK); // Ajoute une bordure à la rivière
                    GridPane.setColumnSpan(square, numColumns); // Étend le rectangle sur toute la largeur
                }

                StackPane squarePane = new StackPane(square);

                // Désactiver les interactions de la souris avec le StackPane
                squarePane.setMouseTransparent(true);

                chessboardGrid.add(squarePane, col, row);
            }
        }
    }

    private void displayImage() {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/GeneralRed.png")));
        StackPane imagePane = new StackPane(imageView);

        // Réglez la position de l'image pour la placer devant la case
        GridPane.setValignment(imagePane, VPos.TOP);

        // Réglez la position de l'image à la bordure supérieure de la case mais sans réussite
        StackPane.setAlignment(imageView, Pos.TOP_CENTER);

        chessboardGrid.add(imagePane, 0, 0);
    }
}
