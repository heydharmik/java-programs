package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class ObtainMinutesAndSeconds {
	
	public static void main(String[] args) {
		int minutes;
		int totalSeconds;
		int seconds;
		Scanner input;
		
		System.out.println("Enter the total number of seconds: ");
		input = new Scanner(System.in);
		totalSeconds = input.nextInt();
		
		minutes = totalSeconds / 60;
		seconds = totalSeconds % 60;
		
		System.out.println("Your output is: " + minutes + " minutes and " + seconds + " seconds.");
		input.close();
	}
}
