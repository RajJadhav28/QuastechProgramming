package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Pro1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(1,"Mango");  //Put elements in Map  
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes");
		map.put(5,"Mango");
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=================");
		map.putIfAbsent(6, "Pineapple");
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.putAll(map);
		System.out.println("After using putAll");
		for(Map.Entry entry:map1.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("After removing element:");
		map.remove(1);
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("After removing element:");
		map.remove(2,"Apple");
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("After replacing:");
		map.replace(3, "Mango");
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("After replacing:");
		map.replace(3, "Mango", "Banana");
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("After replacing All:");
		map.replaceAll((k,v)->"Ajay");
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		}
}

