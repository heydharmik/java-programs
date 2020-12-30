package practicals.sem4;

import java.util.Scanner;

public class ScannerClassExample {
	
	
	public static void main(String[] args) {
		Scanner scan;
		String name;
		System.out.print("Enter your name: ");
		scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("Welcome "+name+" to your first program.");
		scan.close();
	}

}
