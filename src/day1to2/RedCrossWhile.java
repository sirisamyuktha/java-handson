package day1to2;

import java.util.Scanner;

public class RedCrossWhile {

	/**
	 * @author sumit kumar
	 * @code 02-11
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int ref[]=new int[n];
		int sum=0;
		while(i<n) {
			ref[i]=sc.nextInt();
			i++;
		}
		i=0;
		while(i<n) {
			sum=sum+ref[i];
			i++;
		}
		System.out.println(sum);
		sc.close();

	}
	

}
