package controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane chessboardGrid = createChessboard();
        Scene scene = new Scene(chessboardGrid, 500, 500);
        primaryStage.setTitle("Chessboard Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createChessboard() {
        GridPane chessboardGrid = new GridPane();
        chessboardGrid.setGridLinesVisible(true); // Add grid lines for visualization

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                StackPane cellPane = new StackPane();
                cellPane.setStyle("-fx-border-color: black;"); // Add a border for visualization

                // Add a chess piece to the bottom-left of the cell
                if (row == 0 && col == 0) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 8) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 1) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 7) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 2) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 6) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 5) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 3) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 0 && col == 4) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/GeneralRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 3 && col == 2) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 3 && col == 4) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 3 && col == 6) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 3 && col == 8) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 3 && col == 0) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 2 && col == 0) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 2 && col == 0) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                if (row == 2 && col == 0) {
                    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
                    imageView.setFitWidth(80); // Adjust size as needed
                    imageView.setFitHeight(80);
                    StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
                    imageView.setTranslateX(-imageView.getFitWidth() / 2); // Shift horizontally
                    imageView.setTranslateY(imageView.getFitHeight()/2); // Shift vertically
                    cellPane.getChildren().add(imageView);
                }

                // Add a rectangle to the cell
                Rectangle rectangle = new Rectangle(80, 80, Color.TRANSPARENT); // Set the size of the rectangle
                cellPane.getChildren().add(rectangle);

                chessboardGrid.add(cellPane, col, row);
            }
        }

        return chessboardGrid;
    }
}
