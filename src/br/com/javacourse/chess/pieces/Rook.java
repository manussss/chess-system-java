package br.com.javacourse.chess.pieces;

import br.com.javacourse.boardgame.Board;
import br.com.javacourse.chess.ChessPiece;
import br.com.javacourse.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
