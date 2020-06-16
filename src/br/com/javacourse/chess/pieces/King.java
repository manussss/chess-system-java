package br.com.javacourse.chess.pieces;

import br.com.javacourse.boardgame.Board;
import br.com.javacourse.chess.ChessPiece;
import br.com.javacourse.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return null;
	}

}
