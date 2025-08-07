package pkg_29_07_2025_collectionapi;

import java.util.Enumeration;
import java.util.Hashtable;

public class TestHash1 {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		System.out.println(ht);//what will it print {}
		ht.put("1",new Integer(20));
		ht.put("2",new Integer(40));
		ht.put("3",new Integer(60));
		System.out.println(ht);
		System.out.println("ht.get:"+ht.get("3"));
		Enumeration e=ht.keys();
		while(e.hasMoreElements())
		{  
			 Object key = e.nextElement(); 
			 
           Object value = ht.get(key);  
			System.out.println("The key Is "+key+" For The Value "+value );
			
		}
		
		
		
	}

}
