package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void EX_1() {
		assertEquals("Hello, Marc", Welcome.welcome("Marc"));
	}
	
	@Test
	void EX_2() {
		assertEquals("Hello, my friend", Welcome.welcome("    "));
	}
	
	@Test
	void EX_3() {
		assertEquals("Hello, JERRY !", Welcome.welcome("JERRY"));
	}
	
	@Test
	void EX_4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
	}

}
