package day5to6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-17
 *
 */
public class SumAverage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+al.get(i);
		}
		float avg=(float)sum/n;
		System.out.println(sum);
		System.out.println(avg);
		sc.close();
	}

}
