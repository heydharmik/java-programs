package practicals.sem4.oopClassMaterial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		NumberFormat formatter = new DecimalFormat("#0.00");     
		System.out.println("Enter amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.printf("Sales tax is " + formatter.format(tax) + " on " + purchaseAmount + " purchase amount.");
	}
}
