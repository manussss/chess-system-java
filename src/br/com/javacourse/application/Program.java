package br.com.javacourse.application;

import br.com.javacourse.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
		
	}

}
