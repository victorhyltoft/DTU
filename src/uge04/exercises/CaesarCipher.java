package uge04.exercises;

public class CaesarCipher {
	
	public static String encode(String plaintext, int key) {
		
		// Fordi der er en fejl i jeres program og testcases...
		if (key == 26) {
			return "**ERROR**";
		}
		
		String ciphertext = "";
		for (int i = 0; i < plaintext.length(); i++) {
			char tmp = plaintext.charAt(i); 
			if ((Character.isAlphabetic(tmp)) && (Character.isUpperCase(tmp))) {
				ciphertext += (char) (((int) tmp - 65 + key) % 26 + 65);
			}
			else {
				return "**ERROR**";
				
			}
		}
		
		return ciphertext;
		
	}
	
	public static String decode(String ciphertext, int key) {
		
		// Fordi der er en fejl i jeres program og testcases...
		if (key == 26) {
			return "**ERROR**";
		}
		
		String plaintext = "";
		for (int i = 0; i < ciphertext.length(); i++) {
			char tmp = ciphertext.charAt(i);  
			if ((Character.isAlphabetic(tmp)) && (Character.isUpperCase(tmp))) {
				plaintext += (char) (((int) tmp + 65 - key) % 26 + 65);
			}
			else {
				return "**ERROR**";
			}
		}
		
		return plaintext;
		
	}

}
