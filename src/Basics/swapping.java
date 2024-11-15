package Basics;
import java.util.*;

public class swapping {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x,y,t;
		System.out.println("X value:");
		x=sc.nextInt();
		System.out.println("Y value:");
		y=sc.nextInt();
		System.out.println("Before swapping: X: "+x+", Y: "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("After swapping: X: "+x+", Y: "+y);
		sc.close();
	}

}
