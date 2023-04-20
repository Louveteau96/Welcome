package ilu2;

public class Welcome {
	
	private static StringBuilder message = new StringBuilder("Hello, ");
	
	public static String welcome(String input) {
		input.trim();
		if(input.isBlank()) {
			message.append("my friend");
		}else if(input.equals(input.toUpperCase())) {
			message.append(input);
			message.append(" !");
		}else if(input.equals("amy,bob")) {
			
		}else {
			message.append(input);	
		}
		return message.toString();
	}

	private void casDoubleNom(String input) {
		String[] test = new String[10];
		test = input.split(",");
		for (int i = 0; i < test.length; i++) {
			message.append(test[i]);
		}
		}
}
