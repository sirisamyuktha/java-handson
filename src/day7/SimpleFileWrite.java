package day7;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author 841423
 *
 */
public class SimpleFileWrite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the player ");
		String name=sc.nextLine();
		System.out.println("Enter the team name ");
		String teamName=sc.nextLine();
		System.out.println("Enter the number of matches played ");
		int n=sc.nextInt();
	
		try {
			File f= new File("player.csv");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
		
			fw.write(name+" , "+teamName+" , "+n);
			fw.flush();
			fw.close();
			System.out.println("Written successfully !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
