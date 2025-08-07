package pkg_29_07_2025_collectionapi;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector V =new Vector();
     V.add(new Integer(20));
     V.add(new Integer(40));
     V.add(new Integer(60));
     System.out.println(V);
     
     Enumeration e = V.elements();
     int sum=0;
     while(e.hasMoreElements())//this will return Boolean
    	 {
    	 sum+=(int)e.nextElement();
     //System.out.println(e.nextElement);//Object is returned so we cast it using int
     }
     System.out.println(sum);
	}
}


