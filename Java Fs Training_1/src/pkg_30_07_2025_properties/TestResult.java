package pkg_30_07_2025_properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestResult {

	public static void main(String[] args) {
		List<Testing> Testinglist=Arrays.asList(new Testing("Sudhanshu",180.0,"Have Spec","AB+","TO Placed In FAAANG"));
		System.out.println(Testinglist);
	
		
		List<String> Cities= new ArrayList<>();
		Cities.add("Nagpur");
		Cities.add("Bombay");
		Cities.add("Heydrebad");
		Cities.add("kolkat");
		System.out.println(Cities);
		System.out.println(Cities.get(0));
		System.out.println(Cities.get(3));
		//ADVANCE FOR LOOP
		System.out.println("\nADVANCE FOR LOOP");
		for(String C :Cities) {
			System.out.println(C);
		}
		
		//NORMAL LOOP
		System.out.println("\nNORMAL FOR LOOP");
		for(int i=0;i<Cities.size();i++) {
			System.out.println(Cities.get(i));
		}
		
		for (Testing t : Testinglist) {
			System.out.println(t);
		}
	}

}
