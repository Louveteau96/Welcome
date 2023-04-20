package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	private Welcome wc;

	@BeforeEach
	void setUp() throws Exception {
		wc = new Welcome();
	}

	@Test
	void EX_1() {
		assertEquals("Bonjour Marc", wc.welcome("Marc"));
	}

}
