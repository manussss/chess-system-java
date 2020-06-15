package br.com.javacourse.chess;

import br.com.javacourse.boardgame.Board;
import br.com.javacourse.boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
	
	
}
