package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class ImprovedMathLearninTool {
	public static void main(String[] args) {
		Scanner input;
		int a, b;
		int answer;
		
		input = new Scanner(System.in);
		a = (int) (Math.random() * 10);
		b = (int) (Math.random() * 10);
		
		if(a >= b) {
			System.out.println("Subtract " + a + " - " + b);
			System.out.println("Enter your answer: ");
			answer = input.nextInt();
		}
		else {
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println("Subtract " + a + " - " + b);
			System.out.println("Enter your answer: ");
			answer = input.nextInt();
		}
		
		if(answer == (a-b)) {
			System.out.println("Congratulations!! You have learned substraction..");
		}
		else
			System.out.println("You need to learn substraction more...");
		
	}
}
