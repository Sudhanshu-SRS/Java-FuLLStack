package pkg_07_08_2025_concurrentHashmap1;

import java.util.concurrent.ConcurrentHashMap;

//Will not accept null keys or null values
public class ConcurrentHashMap1 {
 public static void main(String[] args) {
     // Create a ConcurrentHashMap
     ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

     // Add elements
     scores.put("jdcom", 95);
     scores.put("css", 96);
     scores.put("sgn", 97);

     // Retrieve elements
     System.out.println("jdcom score: " + scores.get("jdcom"));

     // Update an element
     scores.put("css", 97);

     // Iterate over the map (weakly consistent)
     System.out.println("All scores:");
     scores.forEach((name, score) -> System.out.println(name + ": " + score));

     // Attempt to add if absent
     scores.putIfAbsent("jdcom", 100); // Will not change existing value
     scores.putIfAbsent("abc", 85);    // Will add new entry

     // Print final map
     System.out.println("Scores after putIfAbsent: " + scores);
 }
}
