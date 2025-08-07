package pkg_25_07_2025_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialization {

	public static void main(String[] args) {
		Transient t=new Transient();
		t.empi_id="01";
		t.name="Sudhanshu";
		t.salary=500000;
		
		try {
			FileOutputStream fos = new FileOutputStream("src/serialization25/transientoutput.ser");
	        ObjectOutputStream oos=new ObjectOutputStream(fos);
	      oos.writeObject(t);
	      oos.close();
	      fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
