package pkg_05_08_2025_Test_Differenet_Hasmap_and_sets_and_etc;

import java.util.HashMap;

public class Hashmap {
//Usong Hashmap With Stream API
	public static void main(String[] args) {
     HashMap<String,Integer> Population = new HashMap<>();
     Population.put("India", 990000000);
     Population.put("China", 1400000000);
     Population.put("USA", 331000000);
     Population.put(null, 0); // Adding a null key with a value of 0
     Population.put(null, null);
     Population.put("Indonesia", 273000000);
     Population.put("Pakistan", 225000000);
     Population.put("Brazil", 213000000);
     
     // Using Stream API to filter and print countries with population greater than 300 million
     Population.entrySet().stream().forEach
     //Sudhanshu is my variable name
     (Sudhanshu->System.out.println("Key IS "+Sudhanshu.getKey()+"\t The Value IS "+Sudhanshu.getValue()));
	}

}
