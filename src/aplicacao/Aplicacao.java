package aplicacao;
import chess.ChessMatch;

public class Aplicacao {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());

	}

}
