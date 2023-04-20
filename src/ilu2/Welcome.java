package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder message = new StringBuilder("Bonjour ");
		message.append(input);
		return message.toString();
	}

}
