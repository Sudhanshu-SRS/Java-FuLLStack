package pkg_01_08_2025_teststream2;

import java.util.function.Predicate;

public class Prdeicate1 {

	public static void main(String[] args) {
   Predicate<Integer> oddtest =n-> n %2==0;
   System.out.println(oddtest.test(10)); // true
   System.out.println(oddtest.test(11)); // false
	}

}
