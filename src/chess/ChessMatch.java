package chess;

import boardgame.Board;
import boardgame.Position;
import chess.chessPieces.King;
import chess.chessPieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		intialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void intialSetup() {
		board.placepiece(new King(board, Color.BLACK), new Position(0,4));
		board.placepiece(new King(board, Color.BLACK), new Position(7,4));
		board.placepiece(new Rook(board, Color.BLACK), new Position(2,1));
	}

}
