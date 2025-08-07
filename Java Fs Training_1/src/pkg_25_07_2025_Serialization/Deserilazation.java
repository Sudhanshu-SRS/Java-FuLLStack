package pkg_25_07_2025_Serialization;

import java.io.FileInputStream;


import java.io.ObjectInputStream;


public class Deserilazation {

	public static void main(String[] args) {
		Transient t=null;
		
		try {
			FileInputStream fis = new FileInputStream("src/serialization25/transientoutput.ser");
	        ObjectInputStream ois=new ObjectInputStream(fis);
	     t=(Transient) ois.readObject();
	      ois.close();
	      fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(t.empi_id);
		System.out.println(t.name);
		System.out.println(t.salary);
	}

}
