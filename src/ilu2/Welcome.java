package ilu2;

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
			
			
		//multiple names
		}else if(input.split(",").length >=2) {
			casMultiplesNoms(input.split(","),message);
		
		//base
		}else {
			casNomSimple(input, message);
			
		//return
		}
		return message.toString();
	}

	private static void casMultiplesNoms(String[] input, StringBuilder message) {
		for(int i=0; i <input.length-1;i++) {
			casNomSimple(input[i], message);
			message.append(", ");
		}
		casNomSimple(input[input.length-1], message);
		}
	
	private static void casNomSimple(String input, StringBuilder message) {
		message.append(input.substring(0,1).toUpperCase()+input.substring(1));
	}
}
