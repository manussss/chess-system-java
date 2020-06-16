package br.com.javacourse.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.javacourse.chess.ChessException;
import br.com.javacourse.chess.ChessMatch;
import br.com.javacourse.chess.ChessPiece;
import br.com.javacourse.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
			
				UI.clearScreen();
	
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}
		}
	}

}
