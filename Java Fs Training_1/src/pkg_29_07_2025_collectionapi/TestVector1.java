package pkg_29_07_2025_collectionapi;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector1{

	public static void main(String[] args) {
		
		Vector v=new Vector();
	   
		
		//this will print [] beacause vector is an array question was asked in TCS
		System.out.println(v);
		//Prints The Capacity of Vector
		System.out.println(v.capacity());
		//print the size of vector
		System.out.println(v.size());
		
		v.addElement("Sudhanshu");
		v.addElement(new Integer(10));
		v.addElement(new StringBuffer("sakhare"));
		v.addElement(new Integer(30));
		System.out.println(v);
		//Prints The Capacity of Vector
		System.out.println(v.capacity());
		//print the size of vector
		System.out.println(v.size());
		System.out.println(v.contains("Sudhanshu"));
		
		
		//This IS the method from Enumeration which has two method hasmoreElements & nextElement
		
		Enumeration e=v.elements();
		System.out.println("Printing Values In Vectors");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
	}

}
