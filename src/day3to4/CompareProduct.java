package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-15
 *
 */
public class CompareProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		// product 1
		System.out.println("Enter the product id ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the product name ");
		String productName=sc.nextLine();
		System.out.println("Enter the supplier name ");
		String supplierName=sc.nextLine();
		display(id, productName, supplierName);
		Product p1=new Product(id, productName, supplierName);
		//product 2
		System.out.println("Enter the product id ");
		int id2=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the product name ");
		String productName2=sc.nextLine();
		System.out.println("Enter the supplier name ");
		String supplierName2=sc.nextLine();
		display(id2, productName2, supplierName2);
		Product p2=new Product(id2, productName2, supplierName2);
		
		if(p1.equals(p2)) {
			System.out.println("The two products are the same ");
		}else {
			System.out.println("The two products are not same ");
		}
		sc.close();
	}
	
	
	
	public static void display(int id,String productName,String supplierName) {
		System.out.println("Product Id is "+id);
		System.out.println("Product Name is "+productName);
		System.out.println("Supplier Name is "+supplierName);
	}
}
class Product{
	private long id;
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
	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public Product() {
		
	}
	public boolean equals(Product p) {
		if(this.id==p.id) {
			if(this.productName.equals(p.productName)) {
				if(this.supplierName.equals(p.supplierName)) {
					return true;
				}
			}
		}
		return false;
	}
}













