package Arrays;

public class SecondSmallest {
	 public static int  SecondSmallest(int a[], int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		return a[1];
	}
	 public static int SecondLargest(int a[], int total) {
		 int temp1;
		 for(int i=0;i<total;i++) {
			 for(int j=i+1;j<total;j++) {
				 if(a[i]>a[j]) {
					 temp1=a[i];
					 a[i]=a[j];
					 a[j]=temp1;
				 }
			 }
		 }
		 return a[total-2];
	 }
	 public  void oddposition(int a[]) {
		 for (int i = 1; i < a.length; i=i+2) {
	            System.out.println("Position " + i + ": " + a[i]);
	        }
	 }
	
	public static void main(String args[]) {
		SecondSmallest obj=new SecondSmallest();
		int a[]= {1,2,5,6,7,3};
	
		System.out.println("Second Smallest:"+SecondSmallest(a, 6));
		System.out.println("Second Largest:"+SecondLargest(a, 6));
			
		  System.out.println("Elements at odd positions in the array:");
		  obj.oddposition(a);
		
		}

}
