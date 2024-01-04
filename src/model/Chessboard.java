package model;

public class Chessboard {
    private ChessPiece[][] board;

    public Chessboard() {
        this.board = new ChessPiece[10][9];
        initializeBoard();
    }

    private void initializeBoard() {
        // Placez les pièces initiales pour les deux camps
        placeRedPieces();
        placeBlackPieces();
    }

    private void placeRedPieces() {
        // Placez les pièces pour le camp rouge (par exemple, en haut du plateau)
        board[0][4] = new General("GeneralRed.jpg");
        board[0][3] = new Advisor("AdvisorRed.jpg");
        board[0][5] = new Advisor("AdvisorRed.jpg");
        board[0][2] = new Cannon("CannonRed.jpg");
        board[0][6] = new Cannon("CannonRed.jpg");
        board[0][1] = new Chariot("ChariotRed.jpg");
        board[0][7] = new Chariot("ChariotRed.jpg");
        board[0][3] = new Elephant("ElephantRed.jpg");
        board[0][5] = new Elephant("ElephantRed.jpg");
        board[0][2] = new Horse("HorseRed.jpg");
        board[0][6] = new Horse("HorseRed.jpg");
        board[1][1] = new Soldier("SoldierRed.jpg");
        board[1][3] = new Soldier("SoldierRed.jpg");
        board[1][5] = new Soldier("SoldierRed.jpg");
        board[1][7] = new Soldier("SoldierRed.jpg");
        board[1][9] = new Soldier("SoldierRed.jpg");
    }

    private void placeBlackPieces() {
        // Placez les pièces pour le camp noir (par exemple, en bas du plateau)
        board[9][4] = new General("PieceBlackGeneral.jpg");
        board[9][5] = new Advisor("PieceBlackAdvisor.jpg");
        // Placez les autres pièces noires...
    }

    public ChessPiece getPiece(int row, int col) {
        return board[row][col];
    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    // Ajoutez d'autres méthodes ou fonctionnalités selon vos besoins
}
