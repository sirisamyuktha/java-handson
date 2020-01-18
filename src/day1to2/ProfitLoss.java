package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-10
 */
public class ProfitLoss {

	public static void main(String[] args) {
		int x=0,y=0,z=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased ");
		x=sc.nextInt();
		System.out.println("Enter the price per dozen ");
		y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy ");
		z=sc.nextInt();
		
		int cp=x*y;
		int sp=z*(x*12);
		float profit=sp-cp;
		System.out.print("Sam's profit percentage is " + ((profit/cp)*100)+" percent ");
		
		sc.close();
		
		

	}

}
