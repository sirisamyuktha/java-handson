package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-14
 *
 */
public class CricketCommentry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu \r\n" + 
				"1.Player details of the delivery \r\n" + 
				"2.Run details of the delivery \r\n" + 
				"");
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1) {
			System.out.println("Enter the bowler name ");
			String bowler=sc.nextLine();
			System.out.println("Enter the batsman name ");
			String batsman=sc.nextLine();
			new Delivery().displayDeliveryDetails(bowler, batsman);
		}else {
			System.out.println("Enter the number of runs ");
			long run=sc.nextInt();
			
			new Delivery().displayDeliveryDetails(run);
		}
		sc.close();
	}

}
class Delivery{
	void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Player details of the delivery: ");
		String[] bo=bowler.split(" ");
	    String bowlerlname=bo[bo.length-1];
		
	    String[] ba=batsman.split(" ");
	    String batsmanlname=ba[ba.length-1];
	    System.out.println("Bowler : "+bowlerlname);
	    System.out.println("Batsman : "+batsmanlname);
		
	}
	void displayDeliveryDetails(Long runs) {
		System.out.println("Number of runs scored in the delivery : "+runs);
		if(runs==4) {
			System.out.println("It is a boundary. ");
		}else if(runs==6) {
			System.out.println("It is a Sixer. ");
		}
	}
}