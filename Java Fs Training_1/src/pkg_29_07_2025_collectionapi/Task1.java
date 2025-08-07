package pkg_29_07_2025_collectionapi;

import java.util.Scanner;
import java.util.Vector;
public class Task1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vector name = new Vector();
         name.addElement("Sudhanshu");
         name.addElement("mansi");
         name.addElement("Pranay");
		System.out.println("Enter the Name:-");
		String Iname= s.nextLine();
		
		
		if(name.contains(Iname)) {
			Task1main.main(new String[]{Iname});
		}
		else {
			System.out.println("Name Not Found");
		}
		
		
		s.close();

	}
}



