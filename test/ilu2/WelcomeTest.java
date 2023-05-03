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

//Ces tests ne correspondent plus aux consignes
//	@Test
//	void EX_4() {
//		assertEquals("Hello, Amy, Bob", bonjour.welcome("amy,bob"));
//		//Test name to lowercase
//		assertEquals("Hello, Marc", bonjour.welcome("marc"));
//		//Test name==null
//		assertEquals("Hello, my friend", bonjour.welcome(null));
//	}
//	
//	@Test
//	void EX_5() {
//		assertEquals("Hello, Amy, Bob, Jerry", bonjour.welcome("Amy,bob,jerry"));
//		assertEquals("Hello, Amy, Bob, Jerry", bonjour.welcome("amy,bob,jerry"));
//	}
//	
//	@Test
//	void EX_6() {
//		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !", bonjour.welcome("Amy,BOB,Jerry"));
//		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !", bonjour.welcome("amy,BOB,Jerry"));
//	}
//	
	@Test
	void EX_7() {
		assertEquals("Hello, Bob, Amy and Jerry", bonjour.welcome("bob,amy,jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !",bonjour.welcome("bob,AMY,jerry,JACK"));
	}
	
	@Test
	void EX_8() {
		assertEquals("Hello, Bob and Amy", bonjour.welcome("bob , amy "));
		assertEquals("Hello, Bob and Amy. AND HELLO, JERRY AND JACK !", bonjour.welcome("bob , amy ,  JERRY,JACK"));
	}
	
	@Test
	void EX_9() {
		//Test l'exercice 8 mais avec qu'un seul nom en majuscule
		assertEquals("Hello, Bob and Amy. AND HELLO, JERRY !", bonjour.welcome("bob, amy,    JERRY"));
		//Test normal
		assertEquals("Hello, Bob(x3) and Amy. AND HELLO, JERRY(x2) !", bonjour.welcome("bob, JERRY, amy, bob,   JERRY, bob"));
		assertEquals("Hello, Bob(x4). AND HELLO, JERRY AND AMY(x2) !", bonjour.welcome("bob, JERRY, bob,bob,AMY,bob,AMY"));
	}
	
	@Test
	void EX_10() {
		assertEquals("Bob, Yoda and Amy, Hello. AND HELLO, JERRY !", bonjour.welcome("bob, yoda, amy, JERRY"));
		assertEquals("Hello, Bob and Amy. AND YODA(x2) AND JERRY, HELLO !", bonjour.welcome("bob, YODA, amy, JERRY, YODA"));
		assertEquals("Yoda, Hello. AND HELLO, JERRY !", bonjour.welcome("yoda, JERRY"));
		assertEquals("Hello, Bob. AND YODA, HELLO !", bonjour.welcome("bob,YODA"));
		
		
	}

}
