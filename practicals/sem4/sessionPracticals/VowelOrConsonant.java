package practicals.sem4.sessionPracticals;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner input;
		char c;
		input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		c = input.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			System.out.println("Letter is a vowel");
		}
		else
			System.out.println("Letter is consonant");
		
		input.close();
	}
}
