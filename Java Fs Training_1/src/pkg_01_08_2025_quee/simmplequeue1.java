package pkg_01_08_2025_quee;

import java.util.PriorityQueue;

public class simmplequeue1 {

	public static void main(String[] args) {
		PriorityQueue<String> names=new PriorityQueue<String>();

		names.add("Dbc");
		names.add("bac");
		names.add("cab");
		names.add("aaa");
		System.out.println(names);
		
		 System.out.println("Dekh bhai Aese hota Hai : \n");
		  while (!names.isEmpty()) {
			 
	            System.out.println(names.poll()); // Retrieves and removes the head (smallest element)
	        }

	}

}
