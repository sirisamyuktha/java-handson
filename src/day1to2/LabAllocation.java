package day1to2;

import java.util.Scanner;

public class LabAllocation {

	/**
	 * @author sumit kumar
	 * @code 02-10
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L1=0,L2=0,L3=0;
		System.out.println("Enter x ");
		L1=sc.nextInt();
		System.out.println("Enter y ");
		L2=sc.nextInt();
		System.out.println("Enter z ");
		L3=sc.nextInt();
		
		if(L1>L2){
			if(L2>L3){
				System.out.println("L3 has the minimal seating capacity ");
			}
			else{
				System.out.println("L2 has the minimal seating capacity ");
			}
		}
		else{
			if(L1>L3){
				System.out.println("L3 has the minimal seating capacity ");
			}
			else{
				System.out.println("L1 has the minimal seating capacity ");
			}
		}
		
		sc.close();
	}

}
