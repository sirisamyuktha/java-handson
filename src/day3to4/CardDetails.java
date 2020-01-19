package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-14
 *
 */

public class CardDetails {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Select the Card \r\n" + 
		 		"1.Payback Card \r\n" + 
		 		"2.Membership Card \r\n" + 
		 		"");
		 int choice=sc.nextInt();
		 sc.nextLine();
		 if(choice==1) {
			 System.out.println("Enter the Card Details: ");
			 String details=sc.nextLine();
			 String det[]=details.split("\\|");
			 System.out.println("Enter points in card ");
			 int pointsEarned=sc.nextInt();
			 System.out.println("Enter Amount ");
			 int totalAmount=sc.nextInt();
			 PaybackCard p=new PaybackCard(det[0], det[1], det[2], pointsEarned, totalAmount);
			 System.out.println(p.getHolderName()+"\'s Payback Card Details: ");
			 System.out.println("Card Number "+p.getCardNumber());
			 System.out.println("Points Earned "+p.getPointsEarned());
			 System.out.println("Total Amount "+p.getTotalAmount());
			 
		 }else {
			 System.out.println("Enter the Card Details: ");
			 String details=sc.nextLine();
			 String det[]=details.split("\\|");
			 System.out.println("Enter rating in card ");
			 int rating=sc.nextInt();
			 MembershipCard m=new MembershipCard(det[0], det[1], det[2], rating);
			 System.out.println(m.getHolderName()+"\'s Membership Card Details: ");
			 System.out.println("Card Number "+m.getCardNumber());
			 System.out.println("Rating "+m.getRating());
			
		 }
		 sc.close();
	}

}
abstract class Card{
	String holderName; 
	String cardNumber; 
	String expiryDate;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Card(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	} 
		
	
}

class MembershipCard extends Card{
	int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
	
}
class PaybackCard extends Card{
	int pointsEarned;
	double totalAmount;
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	
	
	
}





