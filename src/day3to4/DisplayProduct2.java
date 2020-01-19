package day3to4;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-15
 *
 */
public class DisplayProduct2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the product name ");
		String productName=sc.nextLine();
		System.out.println("Enter the supplier name ");
		String supplierName=sc.nextLine();
		Product2 p=new Product2(id, productName, supplierName);
		System.out.println(p);
		System.out.println("Invoking getClass() method : "+p.getClass().getCanonicalName());
		sc.close();
	}

}
class Product2{
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
	public Product2(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public Product2() {
	}
	public String toString() {
		return (""+id+" : "+productName+" : "+supplierName);
	}
	
	
	
	
}