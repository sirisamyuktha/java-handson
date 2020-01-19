package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-16
 *
 */
public class Divide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println("The quotient of "+a+"/"+b+" = "+a/b);
		} catch (Exception e) {
			System.out.println("DivideByZeroException caught ");
		}
		finally {
			System.out.println("Inside finally block ");
		}
		sc.close();

	}

}
