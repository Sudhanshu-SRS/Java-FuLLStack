package pkg_05_08_2025_Test_Differenet_Hasmap_and_sets_and_etc;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {
public static void main(String[] testmap) {
	//Key Should have Prope rcontainer like String Here I Have Used Integer but I Have used The 
	HashMap<Integer,String> map = new HashMap<>();
	map.put(1,"Sudhanshu");
	map.put(2,"Mansi");
	map.put(3,"Pranay");
	//Hashtable the order is not maintained but in set The Order Is Maintained
	
	Set<Integer> Keysets=map.keySet();
	for(Integer key : Keysets) {
		System.out.println("Key: " + key + ", Value: " + map.get(key));
	}
	
	
	//when two Hashcode are same it will make collison for to avoid it it will make an LInkedList
	String s1="Aa";
	//Hashcode of s1 and s2 are same So To avoid collision it will make a linked list
	String s3="Aa";
	String s2="BB";
     System.out.println("\nHashcode of s1: " + s1.hashCode());
     System.out.println("Hashcode of s2: " + s2.hashCode());
	 System.out.println("\ns1.equals(s2) :"+s1.equals(s2));
	 System.out.println("s1 == s2  :" + (s1 == s2));
     System.out.println("\ns1.equals(s3) :"+s1.equals(s3));
	 System.out.println("s1 == s3  :" + (s1 == s3));
	
}
}

//Binaray tree is very much advantage of Hashmap
//Hashmap is not synchronized
//Hashmap is not thread safe
//Hashmap is not ordered
//Hashmap is not sorted
//Hashmap is not indexed
//Hashmap is not iterable
//Hashmap is not serializable
