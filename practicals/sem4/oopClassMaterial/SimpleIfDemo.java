package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input;
		int number;
		
		input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number % 5 == 0) {
			System.out.println("HiFive");
		}
		else if(number % 2 == 0)
			System.out.println("HiEven");
		else
			System.out.println("Enter a valid number");
		
		input.close();
	}
}
