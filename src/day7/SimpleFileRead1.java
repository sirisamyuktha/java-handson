package day7;


 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author 841423
 *
 */
public class SimpleFileRead1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name :");
		String fileName=sc.nextLine();
		try {
			File file=new File("C:\\Users\\841423",fileName);
			FileReader fr= new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str=br.readLine();
			while(str!=null) {
				System.out.println(str);
				str=br.readLine();
			}
			br.close();
		} catch (Exception e) {
			
		}
		sc.close();
	
		
	}

}
