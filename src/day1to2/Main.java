package day1to2;
import java.util.Scanner;
class Trainee
{
	private int employee_id;
	private String name;
	private static final String COHORT_CODE = "CHNAJ19004";
	Scanner sc=new Scanner(System.in);
	public Trainee()
	{
		this.employee_id =0;
		this.name ="NA";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id() {
		System.out.println("Enter the employee id");
		this.employee_id=sc.nextInt();
		sc.nextLine();
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter the employee name");
		this.name=sc.nextLine();
	}
	public void display()
	{
		System.out.println(this.getEmployee_id()+" "+this.getName()+" "+Trainee.COHORT_CODE);
	}
}
public class Main {

		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);

			System.out.println("Enter the number of GenC");
			int num=sc.nextInt();
			Trainee obj[]=new Trainee[num];
			for(int i=0;i<num;i++) {
				obj[i]=new Trainee();
			}
			for(int i=0;i<num;i++){
				obj[i].setEmployee_id();
				obj[i].setName();
			}
			for(int i=0;i<num;i++){
				obj[i].display();
			}
			sc.close();
		}


}

