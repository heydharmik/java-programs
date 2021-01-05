package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class ComputingTaxes {
	public static void main(String[] args) {
		int ch;
		double amt, taxAmount = 0;
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("Are you...");
		System.out.println("1. Single");
		System.out.println("2. Married filing jointly or Qualifying Widow(er)");
		System.out.println("3. Married filling separately");
		System.out.println("4. Head of household");
		System.out.println("Enter your choice..");
		ch = input.nextInt();
		
		if(ch == 1) {
			System.out.print("Enter your amount: ");
			amt = input.nextDouble();
			if(amt >= 0 && amt <=8350)
				taxAmount = amt + (amt * 0.1);
			else if(amt > 8350 && amt <= 33950)
				taxAmount = amt + (amt * 0.15);
			else if(amt > 33950 && amt <= 82250)
				taxAmount = amt + (amt * 0.25);
			else if(amt > 82250 && amt <= 171550)
				taxAmount = amt + (amt * 0.28);
			else if(amt > 171550 && amt <= 372950)
				taxAmount = amt = (amt * 0.33);
			else if(amt > 372950 )
				taxAmount = amt + (amt * 0.35);
		}
		else if(ch == 2) {
			System.out.print("Enter your amount: ");
			amt = input.nextDouble();
			if(amt >= 0 && amt <=16700)
				taxAmount = amt + (amt * 0.1);
			else if(amt > 16700 && amt <= 67900)
				taxAmount = amt + (amt * 0.15);
			else if(amt > 67900 && amt <= 137050)
				taxAmount = amt + (amt * 0.25);
			else if(amt > 137050 && amt <= 208850)
				taxAmount = amt + (amt * 0.28);
			else if(amt > 208850 && amt <= 372950)
				taxAmount = amt = (amt * 0.33);
			else if(amt > 372950 )
				taxAmount = amt + (amt * 0.35);
		}
		else if(ch ==3) {
			System.out.print("Enter your amount: ");
			amt = input.nextDouble();
			if(amt >= 0 && amt <=8350)
				taxAmount = amt + (amt * 0.1);
			else if(amt > 8350 && amt <= 33950)
				taxAmount = amt + (amt * 0.15);
			else if(amt > 33950 && amt <= 68525)
				taxAmount = amt + (amt * 0.25);
			else if(amt > 68525 && amt <= 104425)
				taxAmount = amt + (amt * 0.28);
			else if(amt > 104425 && amt <= 186475)
				taxAmount = amt = (amt * 0.33);
			else if(amt > 186475)
				taxAmount = amt + (amt * 0.35);
		}
		else if(ch == 4) {
			System.out.print("Enter your amount: ");
			amt = input.nextDouble();
			if(amt >= 0 && amt <= 11950)
				taxAmount = amt + (amt * 0.1);
			else if(amt > 11950 && amt <= 45500)
				taxAmount = amt + (amt * 0.15);
			else if(amt > 45500 && amt <= 117450)
				taxAmount = amt + (amt * 0.25);
			else if(amt > 117450 && amt <= 190200)
				taxAmount = amt + (amt * 0.28);
			else if(amt > 190200 && amt <= 372950)
				taxAmount = amt = (amt * 0.33);
			else if(amt > 372950 )
				taxAmount = amt + (amt * 0.35);
		}
		else
			System.out.println("Please enter a valid choice.");
		
		System.out.println("Your taxable amount is: " + taxAmount);
		input.close();
	}
}
