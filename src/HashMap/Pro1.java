package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Pro1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Grapse");
		map.put(3, "Apple");
		map.put(4, "Berries");
		System.out.println("Iterating Hashmap");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
