package ilu2;

import java.util.ArrayList;

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
		ArrayList<String> namesToUpperCase = new ArrayList<>();
		ArrayList<String> namesToLowerCase = new ArrayList<>();
		
		for(int i=0; i<input.length;i++) {
			if(input[i].equals(input[i].toUpperCase())) {
				namesToUpperCase.add(input[i]);
			}else {
				namesToLowerCase.add(input[i]);
			}
		}
		caseNameToLowerCase(namesToLowerCase, message);
		caseNameToUpperCase(namesToUpperCase, message);
		
		}
	
	
	
	private static void caseNameToLowerCase(ArrayList<String> namesToLowerCase, StringBuilder message) {
		
		for(int i=0; i <namesToLowerCase.size()-1;i++) {
			casNomSimple(namesToLowerCase.get(i), message);
			message.append(", ");
		}
		message.deleteCharAt(message.length()-2);
		message.append("and ");
		casNomSimple(namesToLowerCase.get(namesToLowerCase.size()-1), message);
	}
	
	private static void caseNameToUpperCase(ArrayList<String> namesToUpperCase, StringBuilder message) {
		if(!namesToUpperCase.isEmpty()) {
			message.append(". AND HELLO, ");
			for(int i=0; i <namesToUpperCase.size()-1;i++) {
				message.append(namesToUpperCase.get(i));
				message.append(", ");
			}
			message.deleteCharAt(message.length()-2);
			message.append("AND ");
			message.append(namesToUpperCase.get(namesToUpperCase.size()-1));
			message.append(" !");
		}
	}
	
	
	private static void casNomSimple(String input, StringBuilder message) {
		message.append(input.substring(0,1).toUpperCase());
		message.append(input.substring(1));
	}

}
