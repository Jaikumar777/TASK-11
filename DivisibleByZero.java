package task11;

import java.util.Scanner;

public class DivisibleByZero {

	public static void main(String[] args) {
		int a,b;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the no 1");
		a=scan.nextInt();
		System.out.println("Enter the no 2");
		b=scan.nextInt();
		try {
			System.out.println("Divided value of 2 numbers: "+(a/b));
			//while dividing if it throws error it will send to catch statement
		}catch(ArithmeticException ex) {
			System.out.println("Divided by zero operation cannot possible so try again "+ex);
		}
		scan.close();
	}
}