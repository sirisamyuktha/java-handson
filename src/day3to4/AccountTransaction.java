package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-13
 *
 */
public class AccountTransaction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Account Number ");
		String ac=sc.nextLine();
		System.out.println("Enter the Account Balance ");
		int bal=sc.nextInt();
		Account a=new Account(ac,bal);
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the amount to deposit ");
			int dep=sc.nextInt();
			a.deposit(dep);
		}else {
			System.out.println("Enter the amount to withdraw  ");
			int wid=sc.nextInt();
			a.withdraw(wid);
		}
		System.out.println("Your balance after the transaction is: "+a.getBalance());
		sc.close();
	}

}
class Account{
	private String accountNumber;
	private int balance;
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int transactionAmount) {
		balance=balance+transactionAmount;
		
	}
	public void withdraw(int transactionAmount) {
		if(balance>transactionAmount) {
			balance=balance-transactionAmount;
		}else {
			System.out.println("Insufficient Balance ");
		}
	}
	
}
