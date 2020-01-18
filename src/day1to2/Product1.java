package day1to2;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-12
 * using getters and setters
*/
public class Product1 {
	public static void main(String[] args) {
		Product p=new Product();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the product id");
		p.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the product name ");
		p.setProductName(sc.nextLine());
		System.out.println("Enter the supplier name ");
		p.setSupplierName(sc.nextLine());
		System.out.println("Product Id is "+p.getId());
		System.out.println("Product Name is "+p.getProductName());
		System.out.println("Supplier Name is "+p.getSupplierName());
		
		sc.close();
	}
	
}
class Product{
	private long id=0;
	private String productName;
	private String supplierName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
}
