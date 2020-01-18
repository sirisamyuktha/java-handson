package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-11
 *
 */
public class ReplaceOrganization {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the content of the document ");
		String content=sc.nextLine();
		System.out.println("Enter the old name of the company");
		String old=sc.nextLine();
		System.out.println("Enter the new name of the company");
		String neww=sc.nextLine();
		System.out.println("The content of the modified document is");
		System.out.println(content.replace(old, neww));
		
		sc.close();
	}

}
