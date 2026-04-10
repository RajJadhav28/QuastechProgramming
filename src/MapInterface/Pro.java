package MapInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pro {
public static void main(String[] args) {
        
        System.out.println("=== MAP INTERFACE - ALL METHODS ===\n");
        
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
        Integer appleValue = map.get("Apple");
        System.out.println("get('Apple'): " + appleValue);
        
        // getOrDefault(Object key, V defaultValue) - Returns value or default if not found
        Integer grapeValue = map.getOrDefault("Grapes", 0);
        System.out.println("getOrDefault('Grapes', 0): " + grapeValue);
        
        // size() - Returns the number of key-value mappings
        System.out.println("size(): " + map.size());
        
        // isEmpty() - Returns true if map contains no key-value mappings
        System.out.println("isEmpty(): " + map.isEmpty());
        
        // containsKey(Object key) - Returns true if map contains specified key
        System.out.println("containsKey('Banana'): " + map.containsKey("Banana"));
        System.out.println("containsKey('Grapes'): " + map.containsKey("Grapes"));
        
        // containsValue(Object value) - Returns true if map contains specified value
        System.out.println("containsValue(20): " + map.containsValue(20));
        System.out.println("containsValue(100): " + map.containsValue(100));
        
        // remove(Object key) - Removes the mapping for a key
        map.remove("Banana");
        System.out.println("After remove('Banana'): " + map);
        
        // remove(Object key, Object value) - Removes entry only if key mapped to value
        boolean removed = map.remove("Apple", 10);  // Only removes if Apple maps to 10
        System.out.println("remove('Apple', 10): " + removed + ", Map: " + map);
        
        // putAll(Map<? extends K, ? extends V> m) - Copies all mappings from specified map
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Pineapple", 30);
        newMap.put("Watermelon", 40);
        map.putAll(newMap);
        System.out.println("After putAll(): " + map);
        
        // clear() - Removes all mappings
        // map.clear(); // Uncomment to clear
        
        // ===========================================
        // 2. VIEW COLLECTIONS
        // ===========================================
        System.out.println("\n2. VIEW COLLECTIONS:");
        System.out.println("------------------------");
        
        // keySet() - Returns a Set view of the keys
        Set<String> keys = map.keySet();
        System.out.println("keySet(): " + keys);
        
        // values() - Returns a Collection view of the values
        Collection<Integer> values = map.values();
        System.out.println("values(): " + values);
        
        // entrySet() - Returns a Set view of the mappings
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("entrySet(): " + entries);
        
        // Iterating through entrySet
        System.out.println("Iterating through entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // ===========================================
        // 3. DEFAULT METHODS (Java 8+)
        // ===========================================
        System.out.println("\n3. DEFAULT METHODS (Java 8+):");
        System.out.println("------------------------");
        
        map.clear();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Initial map: " + map);
        
        // forEach(BiConsumer<? super K, ? super V> action) - Performs action on each entry
        System.out.println("forEach():");
        map.forEach((key, value) -> System.out.println("  " + key + "=" + value));
        
        // putIfAbsent(K key, V value) - Puts if key not present or mapped to null
        map.putIfAbsent("D", 4);  // Key D not present, so added
        map.putIfAbsent("A", 100); // Key A present, so not changed
        System.out.println("After putIfAbsent(): " + map);
        
        // compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        map.compute("A", (k, v) -> v == null ? 0 : v * 10);
        System.out.println("After compute('A', multiply by 10): " + map);
        
        // computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
        map.computeIfAbsent("E", k -> 5);  // Key E absent, so compute
        map.computeIfAbsent("A", k -> 999); // Key A present, so not computed
        System.out.println("After computeIfAbsent(): " + map);
        
        // computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        map.computeIfPresent("B", (k, v) -> v * 20);  // Key B present
        map.computeIfPresent("F", (k, v) -> 100);     // Key F absent, so nothing
        System.out.println("After computeIfPresent(): " + map);
        
        // merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        map.merge("C", 100, (oldValue, newValue) -> oldValue + newValue);
        map.merge("Z", 50, (oldValue, newValue) -> oldValue + newValue); // Key Z absent
        System.out.println("After merge(): " + map);
        
        // getOrDefault (already covered in basic ops)
        System.out.println("getOrDefault('X', 999): " + map.getOrDefault("X", 999));
        
        // replace(K key, V value) - Replaces entry only if key present
        map.replace("A", 1000);
        map.replace("Y", 2000);  // Key Y not present, so no effect
        System.out.println("After replace(): " + map);
        
        // replace(K key, V oldValue, V newValue) - Replaces only if old value matches
        boolean replaced = map.replace("A", 1000, 5000);
        System.out.println("replace('A', 1000, 5000): " + replaced + ", Map: " + map);
        
        // replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        map.replaceAll((k, v) -> v * 2);
        System.out.println("After replaceAll(v * 2): " + map);
        
        // ===========================================
        // 4. COMPARISON AND HASHCODE
        // ===========================================
        System.out.println("\n4. COMPARISON AND HASHCODE:");
        System.out.println("------------------------");
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 10000);
        map2.put("B", 40);
        map2.put("C", 60);
        map2.put("D", 8);
        map2.put("E", 10);
        
        // equals(Object o) - Compares the specified object with this map
        System.out.println("map.equals(map2): " + map.equals(map2));
        
        // hashCode() - Returns the hash code value for this map
        System.out.println("map.hashCode(): " + map.hashCode());
        System.out.println("map2.hashCode(): " + map2.hashCode());
        
        // ===========================================
        // 5. STATIC METHODS (Java 9+)
        // ===========================================
        System.out.println("\n5. STATIC METHODS (Java 9+):");
        System.out.println("------------------------");
        
        // Map.of() - Creates immutable map with up to 10 entries
        Map<String, Integer> immutableMap1 = Map.of("X", 100, "Y", 200);
        System.out.println("Map.of(): " + immutableMap1);
        
        // Map.ofEntries() - Creates immutable map from entries
        Map<String, Integer> immutableMap2 = Map.ofEntries(
            Map.entry("P", 300),
            Map.entry("Q", 400),
            Map.entry("R", 500)
        );
        System.out.println("Map.ofEntries(): " + immutableMap2);
        
        // Map.copyOf() - Creates immutable copy of existing map
        Map<String, Integer> copyMap = Map.copyOf(map);
        System.out.println("Map.copyOf(): " + copyMap);
        
        // ===========================================
        // 6. PRACTICAL EXAMPLES
        // ===========================================
        System.out.println("\n6. PRACTICAL EXAMPLES:");
        System.out.println("------------------------");
        
        // Example 1: Word count
        System.out.println("Example 1: Word Count");
        String sentence = "apple banana apple orange banana apple";
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : sentence.split(" ")) {
            wordCount.merge(word, 1, Integer::sum);
            // Same as: wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word count: " + wordCount);
        
        // Example 2: Student grades
        System.out.println("\nExample 2: Student Grades");
        Map<String, List<Integer>> studentGrades = new HashMap<>();
        
        // computeIfAbsent to initialize ArrayList
        studentGrades.computeIfAbsent("John", k -> new ArrayList<>()).add(85);
        studentGrades.computeIfAbsent("John", k -> new ArrayList<>()).add(90);
        studentGrades.computeIfAbsent("Jane", k -> new ArrayList<>()).add(95);
        
        System.out.println("Student grades: " + studentGrades);
        
        // Example 3: Cache implementation
        System.out.println("\nExample 3: Simple Cache");
        Map<String, String> cache = new HashMap<>();
        
//        String getFromCache(String key) {
//            return cache.computeIfAbsent(key, k -> {
//                System.out.println("  Computing value for: " + k);
//                return "Value for " + k;
//            });
//        }
        
//        System.out.println("First call: " + getFromCache("key1"));
//        System.out.println("Second call (cached): " + getFromCache("key1"));
//        System.out.println("New key: " + getFromCache("key2"));
    }
}
