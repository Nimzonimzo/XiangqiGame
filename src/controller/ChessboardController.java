package controller;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
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
    private GridPane intersectionsGrid;

    @FXML
    private void initialize() {
        initializeChessboard();
        displayImage();
        displayBlackPieces();
    }

    public void initializeChessboard() {
        int numColumns = 8;
        int numRows = 9; // Sans la riviere

        // Créer une grille cachee pour les intersections
        intersectionsGrid = new GridPane();
        intersectionsGrid.setMouseTransparent(true);

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Rectangle square = new Rectangle(50, 50);

                // Couleur alternée pour les cases à modifier plus tard
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.WHITE);
                }

                // Ajout d'une bordure des cases
                square.setStroke(Color.BLACK);

                StackPane squarePane = new StackPane(square);

                // Désactiver les interactions de la souris avec le StackPane plus tard a changer pour jouer
                squarePane.setMouseTransparent(true);

                intersectionsGrid.add(squarePane, col, row);
            }
        }

        // Ajout de la rivière avec des cases bleues (mettre des caractères chinois dedans)
        for (int col = 0; col < numColumns; col++) {
            Rectangle riverSquare = new Rectangle(50, 50, Color.LIGHTBLUE);
            StackPane riverSquarePane = new StackPane(riverSquare);
            riverSquarePane.setMouseTransparent(true);
            intersectionsGrid.add(riverSquarePane, col, numRows / 2);
        }

        // Ajouter la grille cachee au chessboardGrid
        chessboardGrid.add(intersectionsGrid, 0, 0);
    }

    private void displayImage() {
        // Positionne les pièces dans la configuration de départ du camp rouge
        // Chariots
        placePiece("/images/ChariotRed.png", 0, 0);
        placePiece("/images/ChariotRed.png", 8, 0);

        // Horses
        placePiece("/images/HorseRed.png", 1, 0);
        placePiece("/images/HorseRed.png", 7, 0);

        // Elephants
        placePiece("/images/ElephantRed.png", 2, 0);
        placePiece("/images/ElephantRed.png", 6, 0);

        // Advisors
        placePiece("/images/AdvisorRed.png", 3, 0);
        placePiece("/images/AdvisorRed.png", 5, 0);

        // General
        placePiece("/images/GeneralRed.png", 4, 0);

        // Soldier
        placePiece("/images/SoldierRed.png", 0, 2);
        placePiece("/images/SoldierRed.png", 2, 2);
        placePiece("/images/SoldierRed.png", 4, 2);
        placePiece("/images/SoldierRed.png", 6, 2);
        placePiece("/images/SoldierRed.png", 8, 2);

    }

    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir
        // Chariots
        placePiece("/images/ChariotBlack.png", 0, 8);
        placePiece("/images/ChariotBlack.png", 8, 8);

        // Horses
        placePiece("/images/HorseBlack.png", 1, 8);
        placePiece("/images/HorseBlack.png", 7, 8);

        // Elephants
        placePiece("/images/ElephantBlack.png", 2, 8);
        placePiece("/images/ElephantBlack.png", 6, 8);

        // Advisors
        placePiece("/images/AdvisorBlack.png", 3, 8);
        placePiece("/images/AdvisorBlack.png", 5, 8);

        // General
        placePiece("/images/GeneralBlack.png", 4, 8);

        // Soldier
        placePiece("/images/SoldierBlack.png", 0, 5);
        placePiece("/images/SoldierBlack.png", 2, 5);
        placePiece("/images/SoldierBlack.png", 4, 5);
        placePiece("/images/SoldierBlack.png", 6, 5);
        placePiece("/images/SoldierBlack.png", 8, 5);
    }

    private void placePiece(String imagePath, int col, int row) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        imageView.setFitWidth(50); // Ajustez la taille au besoin
        imageView.setFitHeight(50);

        StackPane piecePane = new StackPane(imageView);
        StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
        imageView.setTranslateX(-imageView.getFitWidth() / 2); // Décaler horizontalement
        imageView.setTranslateY(imageView.getFitHeight() / 2); // Décaler verticalement

        GridPane.setValignment(piecePane, VPos.BOTTOM);
        GridPane.setHalignment(piecePane, HPos.LEFT);

        intersectionsGrid.add(piecePane, col, row );

    }

}
