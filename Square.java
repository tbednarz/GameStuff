package gamestuff;

import java.awt.Color;



public class Square {
	private Color color;
	private Piece piece = null;
	
	
	public Square(Color color){
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Piece getPiece() {
		return piece;
	}
	

	public void placePiece(Piece piece) {
		this.piece = piece;
	}
	public Piece removePiece() {
		Piece retrievedPiece = getPiece();
		piece = null;
		return retrievedPiece;
	}

	public boolean isEmpty() {
	if(this.piece == null) {
		return true;
	}else {
		return false;
	}
	}
	


	
	

	
}
