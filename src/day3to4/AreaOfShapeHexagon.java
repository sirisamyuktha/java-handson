//package day3to4;
//
//import java.util.Scanner;
//
//public class AreaOfShapeHexagon {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("1. Rectangle \r\n" + 
//				"2. Square \r\n" + 
//				"3. Circle \r\n" + 
//				"4. Hexagon \r\n" + 
//				"Area Calculator --- Choose your shape \r\n" + 
//				"");
//		int choice=sc.nextInt();
//		if(choice==1) {
//			System.out.println("Enter length and breadth: ");
//			int length=sc.nextInt();
//			int breadth=sc.nextInt();
//			Rectangle r=new Rectangle(length, breadth);
//			System.out.println("Area of Rectangle is: "+Math.round(r.calculateArea()* 100.0)/100.0);
//		}else if(choice==2) {
//			System.out.println("Enter side: ");
//			int side=sc.nextInt();
//			Square s=new Square(side);
//			System.out.println("Area of Square is: "+Math.round(s.calculateArea()* 100.0)/100.0);
//		}else if(choice==3){
//			System.out.println("Enter Radius: ");
//			int radius=sc.nextInt();
//			Circle c=new Circle(radius);
//			System.out.println("Area of Circle is: "+Math.round(c.calculateArea()* 100.0)/100.0);
//		
//		}else {
//			System.out.println("Enter side: ");
//			int side=sc.nextInt();
//			System.out.println("Area of Hexagon is: 0.00");
//		}
//		sc.close();
//
//
//	}
//
//}
//class Shape{
//	protected String shapeName; 
//	double calculateArea() {
//		return 0;
//	}
//	public Shape(String shapeName) {
//		this.shapeName = shapeName;
//	}
//}
//class Square extends Shape{
//	int side;
//	double calculateArea() {
//		return side*side;
//	}
//	public Square( int side) {
//		super("Square");
//		this.side = side;
//	}
//	public int getSide() {
//		return side;
//	}
//	public void setSide(int side) {
//		this.side = side;
//	}
//	
//	
//}
//class Rectangle extends Shape{
//	int length;
//	int breadth;
//	double calculateArea() {
//		return length*breadth;
//	}
//	public Rectangle(int length, int breadth) {
//		super("Rectangle");
//		this.length = length;
//		this.breadth = breadth;
//	}
//	public int getLength() {
//		return length;
//	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public int getBreadth() {
//		return breadth;
//	}
//	public void setBreadth(int breadth) {
//		this.breadth = breadth;
//	}
//	
//	
//}
//class Circle extends Shape{
//	int radius;
//	double calculateArea() {
//		return Math.PI*(radius*radius);
//	}
//	public Circle( int radius) {
//		super("Circle");
//		this.radius = radius;
//	}
//	public int getRadius() {
//		return radius;
//	}
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//	
//	
//	
//}
//
//class Hexagon extends Shape{
//	int side;
//
//	public Hexagon( int side) {
//		super("Hexagon");
//		this.side = side;
//	}
//	
//}