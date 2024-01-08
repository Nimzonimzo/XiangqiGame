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
        board[0][1] = new Elephant();
        board[0][2] = new Cannon();
        board[0][3] = new Chariot();
        board[0][5] = new Horse();
        board[0][6] = new Soldier();
        board[0][7] = new Advisor();
        // Ajoutez d'autres pièces rouges au besoin
    }

    private void placeBlackPieces() {
        board[9][4] = new General();
        // Ajoutez d'autres pièces noires au besoin
    }

    public int getNumRows() {
        return 10;
    }

    public int getNumColumns() {
        return 9;
    }

    public ChessPiece getPiece(int row, int col) {
        return board[row][col];
    }
}