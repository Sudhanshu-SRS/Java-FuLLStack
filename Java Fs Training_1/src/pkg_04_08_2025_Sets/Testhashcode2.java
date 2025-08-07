package pkg_04_08_2025_Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Testhashcode2 {

	public static void main(String[] args) {
		HashSet<String> colours = new HashSet<String>();
		colours.add("Red");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Orange");
		colours.add("Black");
		colours.add("White");
		colours.add("Red"); // Duplicate, will not be added
//		//to find the hashcode of the HashSet
//		System.out.println("Hashcode of HashSet: " + colours.hashCode());
		
		
		//conevrsion create a treeset of hashset elements
		Set<String> treeSet = new TreeSet<String>(colours);
		System.out.println("TreeSet of Colours: " + treeSet);
		
		
		//To find Hascode OF Each Element
		for (String colour : colours) {
			System.out.println("Hashcode of " + colour + ": " + colour.hashCode());
		}
		System.out.println("HashSet of Colours: " + colours);
        colours.clear(); // Clear the HashSet
		System.out.println("HashSet after clearing I.e Removing All Elements : " + colours);
		
		System.out.println("Final HashSet: " + colours);
	}

}
