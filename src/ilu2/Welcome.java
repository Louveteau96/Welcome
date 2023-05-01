package ilu2;

import java.util.ArrayList;
import java.util.HashMap;

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
		HashMap<String,Integer> names = new HashMap<>();
		
		for(int i=0; i<input.length;i++) {
			if(!names.containsKey(input[i].trim())) {
				names.put(input[i].trim(), 1);
				if(input[i].equals(input[i].toUpperCase())) {
					namesToUpperCase.add(input[i].trim());
				}else {
					namesToLowerCase.add(input[i].trim());
				}
			}else{
				names.put(input[i].trim(),names.get(input[i].trim())+1);
			}
		}
		caseNameToLowerCase(namesToLowerCase, message,names);
		caseNameToUpperCase(namesToUpperCase, message,names);
		
		}
	
	
	
	private static void caseNameToLowerCase(ArrayList<String> namesToLowerCase, StringBuilder message, HashMap<String,Integer> names) {
		
		if(namesToLowerCase.size()>1) {
			for(int i=0; i <namesToLowerCase.size()-1;i++) {
				messageSelonNbrNoms(namesToLowerCase.get(i), message, names);
				message.append(", ");
			}
			message.deleteCharAt(message.length()-2);
			message.append("and ");
			casNomSimple(namesToLowerCase.get(namesToLowerCase.size()-1), message);
		}else {
			messageSelonNbrNoms(namesToLowerCase.get(0), message, names);
		}
		
	}
	
	private static void caseNameToUpperCase(ArrayList<String> namesToUpperCase, StringBuilder message, HashMap<String,Integer> names) {
		if(!namesToUpperCase.isEmpty()) {
			message.append(". AND HELLO, ");
			if(namesToUpperCase.size()>1) {
				for(int i=0; i <namesToUpperCase.size()-1;i++) {
					messageSelonNbrNoms(namesToUpperCase.get(i), message, names);
					message.append(", ");
				}
				message.deleteCharAt(message.length()-2);
				message.append("AND ");
				messageSelonNbrNoms(namesToUpperCase.get(namesToUpperCase.size()-1), message, names);
				message.append(" !");
			}else {
				messageSelonNbrNoms(namesToUpperCase.get(0), message, names);
				message.append(" !");
			}
			
		}
	}
	
	
	private static void messageSelonNbrNoms(String nom, StringBuilder message, HashMap<String,Integer> names) {
		if(names.get(nom)>1) {
			message.append(nom.substring(0,1).toUpperCase());
			message.append(nom.substring(1));
			message.append("(x"+names.get(nom).toString()+")");
		}else {
			message.append(nom.substring(0,1).toUpperCase());
			message.append(nom.substring(1));
		}
	}
	
	private static void casNomSimple(String input, StringBuilder message) {
		message.append(input.substring(0,1).toUpperCase());
		message.append(input.substring(1));
	}

}
