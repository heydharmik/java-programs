package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input;
		double fahrenheit;
		double celsius;
		
		System.out.println("Enter a degree in Fahrenheit: ");
		input = new Scanner(System.in);
		fahrenheit = input.nextDouble();
		
		celsius = (5.0/9) * (fahrenheit-32);
		
		System.out.println("Temperature in Celsius is: " + celsius + "°C");
		input.close();
	}
}
