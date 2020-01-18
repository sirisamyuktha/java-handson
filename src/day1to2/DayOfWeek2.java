package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-11
 *
 */
public class DayOfWeek2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String week[]= new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println("Enter the day number");
		int x=sc.nextInt();
		System.out.println("Day of the week is "+week[x-1]);
		sc.close();

	}

}
