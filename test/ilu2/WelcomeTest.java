package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	Welcome bonjour;
	
	@BeforeEach
	void start() {
		bonjour = new Welcome();
	}
	
	@Test
	void EX_1() {
		assertEquals("Hello, Marc", bonjour.welcome("Marc"));
	}
	
	@Test
	void EX_2() {
		assertEquals("Hello, my friend", bonjour.welcome("    "));
	}
	
	@Test
	void EX_3() {
		assertEquals("Hello, JERRY !", bonjour.welcome("JERRY"));
	}
	
	@Test
	void EX_4() {
		assertEquals("Hello, Amy, Bob", bonjour.welcome("amy,bob"));
		//Test name to lowercase
		assertEquals("Hello, Marc", bonjour.welcome("marc"));
		//Test name==null
		assertEquals("Hello, my friend", bonjour.welcome(null));
	}
	
	@Test
	void EX_5() {
		assertEquals("Hello, Amy, Bob, Jerry", bonjour.welcome("Amy,bob,jerry"));
		assertEquals("Hello, Amy, Bob, Jerry", bonjour.welcome("amy,bob,jerry"));
	}

}
