package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class LotteryProblem {
	public static void main(String[] args) {
		int ran, choice;
		Scanner input;
		input = new Scanner(System.in);
		
		ran = (int) Math.abs(Math.random() * 100);
		while(ran < 10) {
			ran = (int) Math.abs(Math.random() * 100);
		}
		
		System.out.print("Enter a two digit number: ");
		choice = input.nextInt();
		
		if(ran == choice)
			System.out.println("Congratulations!! You have won 10000 thousand ;)");
		else if(((choice / 10 == ran / 10) || (choice%10 == ran / 10)) || ((choice / 10 == ran % 10) || (choice%10 == ran % 10)))
			System.out.println("Congratulations!! You have won 3000 thousand");
		else
			System.out.println("Better luck next time.");
		
		System.out.println("The number was " + ran);
		input.close();
	}
}
