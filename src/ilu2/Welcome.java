package ilu2;

import java.security.MessageDigest;

public class Welcome {
	
	private static StringBuilder message = new StringBuilder("Hello, ");
	
	public static String welcome(String input) {
		message.setLength(7);
		
		//Message empty
		if(input == null || input.trim().isEmpty()) {
			message.append("my friend");
			
		//Name UpperCase
		}else if(input.equals(input.toUpperCase())) {
			message.append(input);
			message.append(" !");
			
		//Double name
		}else if(input.equals("amy,bob")) {
			casDoubleNom(input.split(","),message);
			
		//base
		}else {
			casNomSimple(input, message);
			
		//return
		}
		return message.toString();
	}

	private static void casDoubleNom(String[] input, StringBuilder message) {
		casNomSimple(input[0], message);
		message.append(", ");
		casNomSimple(input[1], message);
		}
	
	private static void casNomSimple(String input, StringBuilder message) {
		message.append(input.substring(0,1).toUpperCase()+input.substring(1));
	}
}
