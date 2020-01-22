package day7;

import java.time.LocalDate;
import java.util.Scanner;

public class EmiMonthCalculator {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		String d= sc.nextLine();
		UserMainCode2.displayDate(d);
		sc.close();
		

	}

}
class UserMainCode2 {
	public static void displayDate(String date){
		
		try { 
			String x[] = date.split("\\-");
			
			int year=Integer.parseInt(x[0]);
			int month=Integer.parseInt(x[1]);
			int dat=Integer.parseInt(x[2]);
			
			LocalDate a = LocalDate.of(year,month,dat);
			LocalDate b = a.minusMonths(20);
			
			System.out.println("20 months before "+date+" will be "+b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}