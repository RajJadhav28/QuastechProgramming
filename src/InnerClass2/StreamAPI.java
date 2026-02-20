package InnerClass2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(4,5,7,9,8);
		
		Stream<Integer>data= nums.stream();
//		long data1=data.count();
//		System.out.println(data1);
		
		// Second operation: Create a FRESH stream to sort and print
//		Stream<Integer> sortedData=data.sorted();
//		sortedData.forEach(a->{System.out.println(a);});
//		data.forEach(n->{System.out.println(n);});//we can use stream only once
		
		for(int n:nums) {
			System.out.println(n*2);
		}
		Stream<Integer> mappedData=data.map(n->n*2);//we can write this line in
//												the other format written below
		mappedData.forEach(a->{System.out.println(a);});
		// method 1
//		Predicate<Integer> predi=new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer n) {
//				if(n%2!=0) {
//					return true;
//				}else {
//				return false;
//				}
//			}
//		};
//		method 2
//		Predicate<Integer> predi= n->  n%2!=0;// so the n-> n%2==0 we can 
											//		directlty write this
								//replacing predi as it is written below
//		nums.stream()//second type down written code is the first type
//			.filter(predi)
//			.sorted()
//			.map(n->n*2)
//			.forEach(a->{System.out.println(a);});
		System.out.println("=======================");
//		nums.stream()
//		.filter(n->n%2!=0)
//		.sorted()
//		.map(n->n*2)
//		.forEach(a->{System.out.println(a);});
		
		int result=nums.stream()//second type down written code is the first type
		.filter(n->n%2!=0)
		.sorted()
		.map(n->n*2)
		.reduce(0, (a,b)->a+b);
		System.out.println(result);
	}
}
