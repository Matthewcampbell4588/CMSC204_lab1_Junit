import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1= new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(35);
		g2= new GradeBook(5);
		g2.addScore(666);
		g2.addScore(190);
		g2.addScore(50);
		g2.addScore(720);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1=null;
	}

	

	@Test
	final void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 35.0"));
		assertEquals(3, g1.getScoreSize());
		assertTrue(g2.toString().equals("666.0 190.0 50.0 720.0"));
		assertEquals(4, g2.getScoreSize());
	}

	@Test
	final void testSum() {
		assertEquals(160,g1.sum(), .0001);
		assertEquals(1626,g2.sum(), .0001);
	}

	@Test
	final void testMinimum() {
		assertEquals(35,g1.minimum(), .0001);
		assertEquals(50,g2.minimum(), .0001);
	}

	@Test
	final void testFinalScore() {
		assertEquals(125,g1.finalScore(), .0001);
		assertEquals(1576,g2.finalScore(), .0001);
	}

	

}
