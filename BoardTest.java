package gamestuff;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.awt.Point;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest{
private Board board;
	
	@BeforeEach
	void setUp() throws Exception {
		 board = new Board(8, Color.WHITE, Color.BLACK);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		board = null;
	}
	
	@Test
	void testConstructor() {
		Point topLeft = new Point(0,0);
		Point bottomLeft = new Point(7,0);
		Point topRight = new Point(0,7);
		Point leftEdge = new Point(3,0);
		Point bottomEdge = new Point(7,4);
		Point interior = new Point(4,4);
		assertTrue(board.getSquare(topLeft).getColor().equals(Color.WHITE));
		assertTrue(board.getSquare(bottomLeft).getColor().equals(Color.BLACK));
		assertTrue(board.getSquare(topRight).getColor().equals(Color.BLACK));
		assertTrue(board.getSquare(leftEdge).getColor().equals(Color.BLACK));
		assertTrue(board.getSquare(bottomEdge).getColor().equals(Color.BLACK));
		assertTrue(board.getSquare(interior).getColor().equals(Color.WHITE));
	}
	
	@Test
	void testPiecePlacement() {
		Piece aPiece = new Piece();
		Point aLocation = new Point(1,2);
		assertTrue(board.isEmpty(aLocation));
		board.placePiece(aPiece, aLocation);
		assertFalse(board.isEmpty(aLocation));
		
		//make sure piece is exactly the same piece originally picked
		Piece retrievedPiece = board.getPiece(aLocation);
		assertTrue(retrievedPiece == aPiece);
		
		retrievedPiece = board.removePiece(aLocation);
		assertTrue(board.isEmpty(aLocation));
		assertTrue(retrievedPiece == aPiece);
		
	}
	
}
