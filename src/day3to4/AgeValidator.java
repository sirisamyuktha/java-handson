package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-16
 *
 */
public class AgeValidator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<19) {
			try {
				throw new AgeException();
				
			}catch(Exception e) {
				System.out.println("Exception occured: InvalidAgeException: not valid ");
				
			}
		}else {
			System.out.println("welcome to vote ");
		}
		sc.close();
	}
}
class AgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
}

