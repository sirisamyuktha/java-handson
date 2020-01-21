package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author 841423
 *
 */
public class DisplayDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d= sc.nextLine();
		UserMainCode.displayDate(d);
		sc.close();
	}

}
class UserMainCode{
	public static void displayDate(String date) {
		
		try { 
			SimpleDateFormat sdf1=new SimpleDateFormat("MMMMMMMM dd,yyyy",Locale.ENGLISH);
			Date currentdate=sdf1.parse(date);
		    SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		    System.out.println(sdf2.format(currentdate));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
}