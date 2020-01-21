package day8jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author 841423
 *
 */
public class InsertEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee details\r\n" + 
				"Enter the ID: \r\n" + 
				"");
		int employeeId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Date of birth (dd/MM/yyyy): ");
		String dateOfBirth=sc.nextLine();
		String x[]=dateOfBirth.split("\\/");
		dateOfBirth=x[2]+x[1]+x[0];
		System.out.println("Enter the Salary: ");
		int salary=sc.nextInt();
		Employee e=new Employee(employeeId, name, dateOfBirth, salary);
		EmployeeService es=new EmployeeService();
		es.addEmployee(e);
		sc.close();
	}

}
class Employee{
	private int employeeId;
	private String name;
	private String dateOfBirth;
	private int salary;
	public Employee(int employeeId, String name, String dateOfBirth, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


class  EmployeeDAO {
	public static Connection getConnection(){
		Connection con=null;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","root");  
			
		}catch(Exception e){
			System.out.println(e);
		}  
		return con;	
	}

	public void addEmployee(Employee e) {
		
		String sql="insert into employee values(?,?,?,?)"; 
		try {
			PreparedStatement stmt=EmployeeDAO.getConnection().prepareStatement(sql); 
			stmt.setInt(1, e.getEmployeeId());
			stmt.setString(2, e.getName());
			stmt.setString(3, e.getDateOfBirth());
			stmt.setInt(4, e.getSalary());
			int i=stmt.executeUpdate();  
			System.out.println(i+" Employee added successfull !!");  
			EmployeeDAO.getConnection().close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		 
	

	}
	
}

class EmployeeService{
	public void addEmployee(Employee e){
		EmployeeDAO edao=new EmployeeDAO();
		edao.addEmployee(e);
	}
}

















