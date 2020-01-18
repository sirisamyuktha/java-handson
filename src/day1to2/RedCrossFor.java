package day1to2;

import java.util.Scanner;

/**
 * @author sumit
 * @code 02-11
 *
 */
public class RedCrossFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ref[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			ref[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+ref[i];
		}
		System.out.println(sum);
		sc.close();

	}

}
