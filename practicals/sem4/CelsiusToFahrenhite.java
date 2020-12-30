package practicals.sem4;

import java.util.Scanner;

public class CelsiusToFahrenhite {

	public static void main(String[] args) {
		float celsius, fahrenhite;
		Scanner scan;
		
		scan = new Scanner(System.in);
		
		System.out.print("Enter the value of celsius: ");
		celsius = scan.nextFloat();
		
		fahrenhite = (celsius*9/5)+32;
		
		System.out.println("Temperature in Fahrenhite is: "+fahrenhite+"°F");
		scan.close();
	}

}
