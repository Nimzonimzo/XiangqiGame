package model;

public class Chessboard {
    private ChessPiece[][] board;

    public Chessboard() {
        this.board = new ChessPiece[10][9];
        initializeBoard();
    }

    private void initializeBoard() {
        placeRedPieces();
        placeBlackPieces();
    }

    private void placeRedPieces() {
        board[0][4] = new General();
        // Ajoutez d'autres pièces rouges au besoin
    }

    private void placeBlackPieces() {
        board[9][4] = new General();
        // Ajoutez d'autres pièces noires au besoin
    }

    // Ajoutez d'autres méthodes ou fonctionnalités selon vos besoins
}
