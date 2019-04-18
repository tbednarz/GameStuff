package gamestuff;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
	private Square darkSquare;
	private Square lightSquare;

	@BeforeEach
	void setUp() throws Exception {
	darkSquare = new Square(Color.BLACK);
	lightSquare = new Square(Color.WHITE);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetColor() {
		//ask square to get color and see if its equal to black
		//what should it do, what should it return
		//aslong as it passes the test it doesnt matter
		assertTrue(darkSquare.getColor().equals(Color.BLACK));
		assertTrue(lightSquare.getColor().equals(Color.WHITE));
	}
	@Test
	void testPiecePlacement() {
		Piece aPiece = new Piece();
		assertTrue(lightSquare.isEmpty());
		
		lightSquare.placePiece(aPiece);
		assertFalse(lightSquare.isEmpty());
		
		//make sure piece is exactly the same piece originally picked
		Piece retrievedPiece = lightSquare.getPiece();
		assertTrue(retrievedPiece == aPiece);
		
		retrievedPiece = lightSquare.removePiece();
		assertTrue(lightSquare.isEmpty());
		assertTrue(retrievedPiece == aPiece);
		
	}

}
