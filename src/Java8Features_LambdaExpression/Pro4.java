package Java8Features_LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Pro4 {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,20,30,40,50);
		li.forEach(a->{
			System.out.print(a+" ");
		});
	}
}
