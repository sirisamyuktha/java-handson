package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-12
 *
 */
public class ProfitLossMethod {

	public static void main(String[] args) {
		int x=0,y=0,z=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased ");
		x=sc.nextInt();
		System.out.println("Enter the price per dozen ");
		y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy ");
		z=sc.nextInt();
		sc.close();
		float per=new ProfitLossMethod().calculateProfit(x, y, z);
		System.out.print("Sam's profit percentage is " + (per)+" percent ");

	}
	 public  float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice) {
		int cp=dozenCount*pricePerDozen;
		int sp=sellPrice*(dozenCount*12);
		float profit=sp-cp;
		return (profit/cp)*100;
	 } 
}
