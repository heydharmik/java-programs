package practicals.sem4.sessionPracticals;

import java.util.Scanner;

public class CelsiusToFahrenheitAndKelvin {
	public static void main(String[] args) {
		Scanner input;
		double fahrenheit;
		double celsius;
		double kelvin;
		
		System.out.println("Enter a degree in Fahrenheit: ");
		input = new Scanner(System.in);
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 9.0/5) + 32;
		kelvin = celsius + 273.15;
		
		System.out.printf("Temperature in Fahrenheit is: %.2f °F%n", fahrenheit);
		System.out.printf("Temperature in Kelvin is: %.2f °K", kelvin);
		
		input.close();
	}
}
