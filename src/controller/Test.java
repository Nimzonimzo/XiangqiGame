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
        Scene scene = new Scene(chessboardGrid, 600, 600);
        primaryStage.setTitle("Chessboard Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createChessboard() {
        GridPane chessboardGrid = new GridPane();
        chessboardGrid.setGridLinesVisible(true); // Add grid lines for visualization

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                StackPane cellPane = new StackPane();
                cellPane.setStyle("-fx-border-color: black;"); // Add a border for visualization

                // Add a chess piece to the bottom-left of the cell
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
