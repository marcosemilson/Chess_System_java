package aplicacao;
import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Aplicacao {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());

	}

}
