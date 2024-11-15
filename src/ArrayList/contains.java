package ArrayList;

import java.util.ArrayList;

public class contains {
	public static void main(String args[]) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		boolean ans=arr.contains(2);
		if(ans) {
			System.out.println("This list contains 2");
		}else {
			System.out.println("This list does not contains 2");
		}
		ans=arr.contains(5);
				if(ans) {
					System.out.println("This list contains 5");
				}else {
					System.out.println("This list does not contains 5");
				}
				
	}

}
