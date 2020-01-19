package day5to6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-17
 *
 */
public class SortScore {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		for(int i=0;i<n;i++) {
			System.out.println(al.get(i));
		}
		sc.close();
	}

}
