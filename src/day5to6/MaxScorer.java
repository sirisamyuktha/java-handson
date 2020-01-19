package day5to6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 * @author sumit kumar
 * @code 02-18
 *
 */
import java.util.Scanner;

public class MaxScorer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players ");
		int n=sc.nextInt();
		sc.nextLine();
		HashMap<String, Long> h= new HashMap<String, Long>();                        
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of the player "+(i+1));
			String name=sc.nextLine();
			Long l=sc.nextLong();
			sc.nextLine();
			h.put(name, l);
		}
		Long maxValueInMap=(Collections.max(h.values()));  
        for (Map.Entry<String, Long> entry : h.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());    
            }
        }
        sc.close();
	}

}
