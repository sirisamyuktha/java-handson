package day5to6;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

/**
 * @author sumit kumar
 * @code 02-18
 *
 */
public class SetOfBoxes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Box ");
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<Box> hash= new HashSet<Box>();                        
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Box "+(i+1)+" Details");
			System.out.println("Enter Length");
			float l=sc.nextFloat();
			System.out.println("Enter Width");
			float w=sc.nextFloat();
			System.out.println("Enter Height");
			float h=sc.nextFloat();
			Box box=new Box(l, w, h);
			
			Iterator<Box> itr = hash.iterator(); 
			boolean b=false;
			while (itr.hasNext()) { 
				
				if(itr.next().equals(box)){
					b=true;
					break;
				}
			}
			if(b) {
				
			}else {
				hash.add(box);
			}
		}
		System.out.println("Unique Boxes in the Set are ");
		for(int i=0;i<n;i++) {
			System.out.println(hash);
		}
		sc.close();

	}

}
class Box{
	private float length;
	private float width;
	private float height;
	float volume;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setVolume() {
		 volume=(this.height*this.length*this.width);
	}
	
	
	
	
	public Box(float length, float width, float height) {
		this.length = length;
		this.width = width;
		this.height = height;
		setVolume();
	}



	public String toString() {
		return ("Length = "+length+" Width = "+width+" Height = "+height+" Volume = "+(volume));
	}
	public boolean equals(Box b) {
		if(this.volume==b.volume) {
			return true;
		}
		return false;
	}
}
