package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner input;
		double weight, height, bmi;
		int age;
		
		input = new Scanner(System.in);
		System.out.println("This is app is designed for children who are 16 years or older.\nWhat is your age?");
		age = input.nextInt();
		
		if(age <= 16) {
			System.out.print("Enter your weight in Kilograms: ");
			weight = input.nextDouble();
			System.out.print("Enter your height in meters: ");
			height = input.nextDouble();
			
			bmi = weight / (Math.pow(height, 2));
			
			if(bmi < 18.5)
				System.out.println("You are underweight");
			if(bmi > 18.5 && bmi < 25.0)
				System.out.println("You are normal");
			if(bmi >= 25.0 && bmi < 30.0)
				System.out.println("You are overweight");
			if(bmi >= 30.0)
				System.out.println("You are obese");
		}
		else
			System.out.println("The age should be smaller than 16");
		input.close();
	}
}
