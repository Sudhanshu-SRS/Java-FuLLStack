package pkg_05_08_2025_Test_Differenet_Hasmap_and_sets_and_etc;

import java.util.HashMap;

public class Hashmap2 {
//using HashMap With Lambda Expression
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1Be", "Sudhanshu");
		map.put("2AA", "Mansi");
		map.put("3", "Pranay");
		map.put("4A", "Girgit");
		map.put("5", "Utkarsha");
		
		
		// Using forEach with Lambda Expression
		/*for Key We have Use k and For Value We have use V*/
		map.forEach((k,v) -> {
			System.out.println("Key: " + k + ", \t Value: " + v);
		});
		

	}

}
