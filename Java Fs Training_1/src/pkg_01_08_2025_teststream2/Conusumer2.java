package pkg_01_08_2025_teststream2;

import java.util.Arrays;
import java.util.List;

public class Conusumer2 {

	public static void main(String[] args) {
     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
     	// Using a lambda expression to print each element of the list
     //advanced feature of Java 8, the forEach method is used to iterate over the list.
     //enhanced for loop is replaced with a more functional style using streams.
     list.stream().forEach(n->System.out.println(n));
    
	}

}
