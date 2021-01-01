package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class MonetaryUnits {
	public static void main(String[] args) {
		Scanner input;
		double dollars;
		double cents;
		int choice;
		
		double quarters, dimes, nickel, pennies;
		
		System.out.println("Do you want to enter amount in Dollars or cents?");
		System.out.println("Press 1 to enter in Dollar\nPress 2 to enter in Cents..");
		input = new Scanner(System.in);
		choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Dollars: ");
			dollars = input.nextDouble();
			
			quarters = dollars * 4;
			dimes = dollars * 10;
			nickel = dollars * 20;
			pennies = dollars * 100;
			cents = dollars * 100;
		
			System.out.println("You have enterd " + dollars + " dollars\nTherefore,");
			System.out.println("Cents = " + cents + "\nQuarters = " + quarters + "\nDimes = " + dimes + "\nNickel = " + nickel + "\nPennies = " + pennies);			
			break;
		case 2:
			System.out.println("Enter Cents: ");
			cents = input.nextDouble();
			
			dollars = cents / 100;
			quarters = dollars * 4;
			dimes = dollars * 10;
			nickel = dollars * 20;
			pennies = dollars * 100;
			
			System.out.println("You have enterd " + cents + " cents\nTherefore,");
			System.out.println("Dollars = " + dollars + "\nQuarters = " + quarters + "\nDimes = " + dimes + "\nNickel = " + nickel + "\nPennies = " + pennies);			
			break;
		default:
			System.out.println("Please Enter a valid choice..");
		}
		
	}
}
