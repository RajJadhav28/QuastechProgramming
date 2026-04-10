package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pro2 {
	public static void main(String[] args) {
		System.out.println("=== MAP INTERFACE - ALL METHODS ===\n\\");
		
		// Create a HashMap (most common Map implementation)
        Map<String, Integer> map = new HashMap<>();
        
     // ===========================================
        // 1. BASIC OPERATIONS
        // ===========================================
        System.out.println("1. BASIC OPERATIONS:");
        System.out.println("------------------------");
        
        // put(K key, V value) - Associates the specified value with the specified key
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);
        map.put("Mango", 25);
        System.out.println("After put(): " + map);
        
        // get(Object key) - Returns the value to which the specified key is mapped
        int appleValue=map.get("Apple");
        System.out.println("get('Apple'):"+appleValue);
        
        int grapesValue=map.getOrDefault("Gapes", 0);
        System.out.println(grapesValue);
        
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsValue(20));
        
        Set<String> keys=map.keySet();
        System.out.println("keySet():"+keys);
        
        Collection<Integer> values=map.values();
        System.out.println("values():"+values);
        
        Set<Map.Entry<String, Integer>> entries=map.entrySet();
        System.out.println(entries);
        
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("============");
        map.forEach((key, value)->System.out.println(key+":"+value));
        
        map.compute("A", (k, v) -> v == null ? 0 : v * 10);
        System.out.println(map);
        map.computeIfAbsent("E", k->5);
        System.out.println(map);
        map.computeIfPresent("E", (k, v) -> v * 20); 
        System.out.println(map);
        
        map.computeIfPresent("B", (k,v)->v*20);
        System.out.println(map);
        
        map.merge("C", 100, (oldValue, newValue)->oldValue+newValue);
        System.out.println(map);
        map.merge("C", 100, (oldValue, newValue)->oldValue+newValue);
        System.out.println(map);
        System.out.println("getOrDefault('X', 999): " + map.getOrDefault("X", 999));
        System.out.println("getOrDefault('X', 999): " + map.getOrDefault("X", 1999));
        System.out.println(map);
        map.computeIfAbsent("X",k->999);
        System.out.println(map);
        System.out.println("getOrDefault('X', 999): " + map.getOrDefault("X", 1999));
        System.out.println(map);
        
        map.merge("C", 100, (oldValue, newValue)->oldValue+newValue);
        System.out.println(map);
        
        map.replaceAll((k,v)->v*2);
        System.out.println(map);
        Map<String, Integer> copyMap=Map.copyOf(map);
        System.out.println(copyMap);
	}
	
}
