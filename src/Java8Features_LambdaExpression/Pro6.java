package Java8Features_LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pro6 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,5,7,9,8);
		Stream<Integer> data = nums.stream();
//		long data1=data.count();
//		System.out.println("count:"+data1);
		//we can use stream only once
		
		//Second operation
//		 Stream<Integer> sortedData=data.sorted();
//		 sortedData.forEach(a->{System.out.println(a);});
		
		//Third run condition
//		 data.forEach(n->{System.out.println(n);});
		 //This method will run also after keeping the 3rd method
//		 System.out.println("================================");
//		 System.out.println("Double of the numbers:");
		 for(int n:nums) {
			 System.out.println(n*2);
		 }
		
		//fourth method type to run
		 Stream<Integer> mappedData=data.map(n->n*2);
		 mappedData.forEach(a->{System.out.println(a);});
		 System.out.println("============================");
		 nums.stream()
				 .filter(n->n%2!=0)
				 .sorted()
				 .map(n->n*2)
				 .forEach(a->{System.out.println(a);});
		 
		 System.out.println("=====================");
		 int result=nums.stream()
				 .filter(n->n%2!=0)
				 .sorted()
				 .map(n->n*2)
				 .reduce(0, (a,b)->a+b);
			System.out.println(result);
	}
}
