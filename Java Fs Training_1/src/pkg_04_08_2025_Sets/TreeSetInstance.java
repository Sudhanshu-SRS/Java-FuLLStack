package pkg_04_08_2025_Sets;

import java.util.TreeSet;

public class TreeSetInstance {

	public static void main(String[] args) {
		TreeSet<String> TreeSet = new TreeSet<>();
		TreeSet.add("A");
		TreeSet.add("B");
		TreeSet.add("C");
		TreeSet.add("1");
		TreeSet.add("3");
		TreeSet.add("3");
		TreeSet.add("55");
		TreeSet.add("27");
		System.out.println(TreeSet.toString());
		System.out.println("The Size Of The TreeSet Is: " + TreeSet.size());
		System.out.println("The Highes Integer Is: " + TreeSet.pollFirst());
		System.out.println("The Lowest Integer Is: " + TreeSet.pollLast());
		

	}

}
