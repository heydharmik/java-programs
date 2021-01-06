package practicals.sem4.sessionPracticals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ScanningThreeInputs {
	public static void main(String[] args) {
		String s1, s2, s3;
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		s1 = input.next();
		s2 = input.next();
		s3 = input.next();
		
		Integer a[] = new Integer[3];
		a[0] = Integer.parseInt(s1);
		a[1] = Integer.parseInt(s2);
		a[2] = Integer.parseInt(s3);
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Number in decreasing order are: " + Arrays.toString(a));
		input.close();
	}
}
