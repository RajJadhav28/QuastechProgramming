package Arrays;


public class Minimum {
	static void min(int arr[]) {
		int min=arr[0];//min=33
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {	//33>3					 //3>4!
				min=arr[i];		//min will be equal to 3//
				System.out.println(min);// will print 3 // it will stay 3
			}
		}
	}
	public static void main(String args[]) {
		int a[]= {33,3,4,5};
		min(a);
		
		
	}

}
