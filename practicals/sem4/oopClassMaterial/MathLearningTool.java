package practicals.sem4.oopClassMaterial;

import java.util.Scanner;

public class MathLearningTool {
	public static void main(String[] args) {
		Scanner input;
		int a, b;
		int answer;
		
		input = new Scanner(System.in);
		a = (int) (Math.random()*10);
		b = (int) (Math.random() * 10);
		
		System.out.println("The equation is: " + a + " + " + b + " = ?");
		
		System.out.print("Please enter your answer: ");
		answer = input.nextInt();
		
		if(answer == (a+b)) {
			System.out.println("Congrats!! Your answer is correct..");
		}
		else {
			System.out.println("Better luck next time!!");
		}
		input.close();
	}
}
