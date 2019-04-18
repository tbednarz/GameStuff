package gamestuff;

import java.awt.Color;
import java.awt.Point;

public class Board {
	
	
	private Piece aPiece = null;

	private Square[][] squares;

	public Board(int size, Color lightColor, Color darkColor) {
		squares = new Square[size][size];
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if ((column + row) % 2 == 0) {
					squares[row][column] = new Square(lightColor);
				} else {
					squares[row][column] = new Square(darkColor);
				}

			}
		}

	}
	
	public Square getSquare(Point aLocation) {
		return squares[aLocation.x][aLocation.y];
	}
	
	public Boolean isEmpty(Point aLocation) {
		if (getPiece(aLocation) == null) {
			return true;
		} else {
			return false;
		}
		//return isEmpty(aLocation);
	}
	
	public Piece getPiece(Point aLocation) {
		return aPiece;
	}
	

	public void placePiece(Piece aPiece, Point aLocation) {
		
		this.aPiece = aPiece;
	}
	
	public Piece removePiece(Point aLocation) {
		Piece retrievedPiece = getPiece(aLocation);
		this.aPiece = null;
		return retrievedPiece;
	}

}
