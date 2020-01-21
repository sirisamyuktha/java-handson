package day8jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 841423
 *
 */
public class DisplayEmployee {

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
		String z[]=dateOfBirth.split("\\/");
		dateOfBirth=z[2]+z[1]+z[0];
		System.out.println("Enter the Salary: ");
		int salary=sc.nextInt();
		Employee2 e=new Employee2(employeeId, name, dateOfBirth, salary);
		EmployeeService2 es=new EmployeeService2();
		es.addEmployee(e);
		ArrayList<Employee> emp=es.getAllEmployee();
		for(Employee x:emp){
			System.out.println(x.getEmployeeId()+" "+x.getDateOfBirth()+" "+x.getSalary());
		}
		sc.close();

	}

}
class Employee2{
	private int employeeId;
	private String name;
	private String dateOfBirth;
	private int salary;
	public Employee2(int employeeId, String name, String dateOfBirth, int salary) {
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


class  EmployeeDAO2 {
	public static Connection getConnection(){
		Connection con=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","root");  
			
		}catch(Exception e){
			System.out.println(e);
		}  
		return con;	
	}

	public void addEmployee(Employee2 e) {
		
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
	public ArrayList<Employee> getAllEmployees(){
		ArrayList<Employee> a= new ArrayList<Employee>();
		try {
			String sql="select * from Employee";
			PreparedStatement stmt=EmployeeDAO.getConnection().prepareStatement(sql); 
		
			ResultSet rs=stmt.executeQuery(); 
			
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				
				String pattern = "dd/MM/yyyy";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				String date = simpleDateFormat.format(rs.getDate(3));
				
				int sal=rs.getInt(4);
				Employee e = new Employee(id, name, date, sal);
				a.add(e);
				
			}		
			
			
			EmployeeDAO.getConnection().close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		return a;
	}
	
}

class EmployeeService2{
	public void addEmployee(Employee2 e){
		EmployeeDAO2 edao=new EmployeeDAO2();
		edao.addEmployee(e);
		
	}
	public ArrayList<Employee> getAllEmployee(){
		EmployeeDAO2 edao=new EmployeeDAO2();
		
		return edao.getAllEmployees();
		
	}
}




