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

        // Cannon
        placePiece("/images/CannonRed.png", 1, 2);
        placePiece("/images/CannonRed.png", 7, 2);

        // Elephants
        placePiece("/images/ElephantRed.png", 2, 0);
        placePiece("/images/ElephantRed.png", 6, 0);

        // Advisors
        placePiece("/images/AdvisorRed.png", 3, 0);
        placePiece("/images/AdvisorRed.png", 5, 0);

        // General
        placePiece("/images/GeneralRed.png", 4, 0);

        // Soldier
        placePiece("/images/SoldierRed.png", 0, 3);
        placePiece("/images/SoldierRed.png", 2, 3);
        placePiece("/images/SoldierRed.png", 4, 3);
        placePiece("/images/SoldierRed.png", 6, 3);
        placePiece("/images/SoldierRed.png", 8, 3);

    }

    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir
        // Chariots
        placePiece("/images/ChariotBlack.png", 0, 9);
        placePiece("/images/ChariotBlack.png", 8, 9);

        // Horses
        placePiece("/images/HorseBlack.png", 1, 9);
        placePiece("/images/HorseBlack.png", 7, 9);

        // Elephants
        placePiece("/images/ElephantBlack.png", 2, 9);
        placePiece("/images/ElephantBlack.png", 6, 9);

        // Advisors
        placePiece("/images/AdvisorBlack.png", 3, 9);
        placePiece("/images/AdvisorBlack.png", 5, 9);

        // General
        placePiece("/images/GeneralBlack.png", 4, 9);

        // Cannon
        placePiece("/images/CannonBlack.png", 1, 7);
        placePiece("/images/CannonBlack.png", 7, 7);

        // Soldier
        placePiece("/images/SoldierBlack.png", 0, 6);
        placePiece("/images/SoldierBlack.png", 2, 6);
        placePiece("/images/SoldierBlack.png", 4, 6);
        placePiece("/images/SoldierBlack.png", 6, 6);
        placePiece("/images/SoldierBlack.png", 8, 6);


    }

    private void placePiece(String imagePath, int col, int row) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        imageView.setFitWidth(50); // Ajustez la taille au besoin
        imageView.setFitHeight(50);

        StackPane piecePane = new StackPane(imageView);
        StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
        imageView.setTranslateX(-imageView.getFitWidth() / 2); // Décaler horizontalement
        imageView.setTranslateY(-imageView.getFitHeight() / 2); // Décaler verticalement

        GridPane.setValignment(piecePane, VPos.BOTTOM);
        GridPane.setHalignment(piecePane, HPos.LEFT);

        intersectionsGrid.add(piecePane, col, row );

    }

}
