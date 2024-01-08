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
        // Affiche l'image du General Rouge
        ImageView generalImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/GeneralRed.png")));
        StackPane generalImagePane = new StackPane(generalImageView);
        StackPane outerGeneralPane = new StackPane(generalImagePane);
        generalImageView.setFitWidth(50); // Ajuste la largeur de l'image
        generalImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        generalImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

        // Affiche l'image de l'Éléphant Rouge (nouvelle pièce)
        ImageView elephantImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantRed.png")));
        StackPane elephantImagePane = new StackPane(elephantImageView);
        StackPane outerElephantPane = new StackPane(elephantImagePane);
        elephantImageView.setFitWidth(50); // Ajuste la largeur de l'image
        elephantImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        elephantImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

        // Affiche l'image du Advisor Rouge
        ImageView advisorImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorRed.png")));
        StackPane advisorImagePane = new StackPane(advisorImageView);
        StackPane outerAdvisorPane = new StackPane(advisorImagePane);
        advisorImageView.setFitWidth(50); // Ajuste la largeur de l'image
        advisorImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        advisorImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

// Affiche l'image du Soldier Rouge
        ImageView soldierImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
        StackPane soldierImagePane = new StackPane(soldierImageView);
        StackPane outerSoldierPane = new StackPane(soldierImagePane);
        soldierImageView.setFitWidth(50); // Ajuste la largeur de l'image
        soldierImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        soldierImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

// Affiche l'image du Cannon Rouge
        ImageView cannonImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/CannonRed.png")));
        StackPane cannonImagePane = new StackPane(cannonImageView);
        StackPane outerCannonPane = new StackPane(cannonImagePane);
        cannonImageView.setFitWidth(50); // Ajuste la largeur de l'image
        cannonImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        cannonImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

// Affiche l'image du Chariot Rouge
        ImageView chariotImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotRed.png")));
        StackPane chariotImagePane = new StackPane(chariotImageView);
        StackPane outerChariotPane = new StackPane(chariotImagePane);
        chariotImageView.setFitWidth(50); // Ajuste la largeur de l'image
        chariotImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        chariotImagePane.setTranslateX(25); // Déplace l'image vers le bord droit

// Affiche l'image du Horse Rouge
        ImageView horseImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
        StackPane horseImagePane = new StackPane(horseImageView);
        StackPane outerHorsePane = new StackPane(horseImagePane);
        horseImageView.setFitWidth(50); // Ajuste la largeur de l'image
        horseImageView.setFitHeight(50); // Ajuste la hauteur de l'image
        horseImagePane.setTranslateX(25); // Déplace l'image vers le bord droit



        chessboardGrid.add(outerGeneralPane, 0, 0); // Affiche le General Rouge
        chessboardGrid.add(outerElephantPane, 1, 0); // Affiche l'Éléphant Rouge (dans la deuxième colonne)
        chessboardGrid.add(outerCannonPane, 2, 0);
        chessboardGrid.add(outerChariotPane, 3, 0);
        chessboardGrid.add(outerHorsePane, 4, 0);
        chessboardGrid.add(outerSoldierPane, 5, 0);
        chessboardGrid.add(outerAdvisorPane, 6, 0);
    }
}