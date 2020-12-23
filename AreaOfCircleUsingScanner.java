import java.util.Scanner;

public class AreaOfCircleUsingScanner {
	public static void main(String[] args) {
		Scanner scan;
		final double PI = 3.1417;
		int radius;
		scan = new Scanner(System.in);
		
		System.out.println("Please enter the value of radius: ");
		radius = scan.nextInt();
		
		System.out.println("Area of circle is: "+((radius*radius)*PI));
	}
}
