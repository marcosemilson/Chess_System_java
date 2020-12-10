package boardgame;

public class Piece {
	
	protected Position position;
	protected Board board;
	
	public Piece(Board board) {
		this.board = board;
		board = null;
	}

	protected Board getBoard() {
		return board;
	}

}
