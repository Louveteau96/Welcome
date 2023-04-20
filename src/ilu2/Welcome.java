package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder message = new StringBuilder("Hello, ");
		input.trim();
		if(input.isBlank()) {
			message.append("my friend");
		}else {
			message.append(input);	
		}
		return message.toString();
	}
	

}
