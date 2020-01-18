package day1to2;

import java.util.Scanner;

public class DiscountCalculation {

	/**
	 * @author sumit kumar
	 * @code 02-10
	 */
	public static void main(String[] args) {
		float price1=0,price2=0;
		int discount=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Price of item 1 : ");
		price1=sc.nextFloat();
		System.out.println("Price of item 2 : ");
		price2=sc.nextFloat();
		System.out.println("Discount in percentage : ");
		discount=sc.nextInt();
		float total=price1+price2;
		float  priceAfterDiscount = (total*discount)/100;
		float discounted = total-priceAfterDiscount;
		System.out.printf("Total amount : $%.2f",total);
		System.out.println();
		System.out.printf("Discounted amount : $%.2f",discounted);
		System.out.println();
		System.out.printf("Saved amount : $%.2f",priceAfterDiscount);
		
		sc.close();

	}

}
