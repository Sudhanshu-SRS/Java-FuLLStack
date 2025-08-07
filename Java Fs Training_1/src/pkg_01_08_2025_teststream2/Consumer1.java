package pkg_01_08_2025_teststream2;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
      Consumer<Integer> intconsumer=(i)->System.out.println(i);
      intconsumer.accept(10);
	}

}
//noting more than a simple consumer that prints an integer to the console.
// This code defines a simple Java program that uses a Consumer to print an integer value.
//Accept method of the Consumer interface is called with the value 10, which is then printed to the console.
