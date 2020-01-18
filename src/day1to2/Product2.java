package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-12
 *
 */
public class Product2 {

	public static void main(String[] args) {
		
		long x;
		String y;
		String z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product id");
		x=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the product name ");
		y=sc.nextLine();
		System.out.println("Enter the supplier name ");
		z=sc.nextLine();
		
		Product3 p=new Product3(x,y,z);
		p.display();
		sc.close();
	}

}
class Product3{
	private long id=0;
	private String productName;
	private String supplierName;
	public Product3(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public Product3() {}
	void display() {
		System.out.println("Product Id is "+id);
		System.out.println("Product Name is "+productName);
		System.out.println("Supplier Name is "+supplierName);
	}
}
