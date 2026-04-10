package MapInterface2;

import java.util.HashMap;
import java.util.Map;

public class Pro1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3,"Banana");   
		map.put(4,"Grapes");
		map.put(5,"Mango");
		
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=========================");
		map.putIfAbsent(6, "pineapple");
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=========================");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.putAll(map);
		for(Map.Entry<Integer,String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=========================");
		map.remove(2,"Apple");
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=================");
		map.computeIfAbsent(7, v->"Jay");
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}
}
