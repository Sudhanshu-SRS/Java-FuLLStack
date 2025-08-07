package pkg_01_08_2025_teststream2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Testing_Task_Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
   System.out.println("Enter marks : ");   
   // Prompt user for marks
     int studentmarks = sc.nextInt();
     sc.close();
     // Using a Predicate to check if a student has passed based on marks
     // Predicate to check if the marks are greater than or equal to 40
     
     Predicate<Integer> isPass = marks -> marks >= 40;
        
     if (isPass.test(studentmarks)) {
		 System.out.println("Student has passed.");
	 } else {
		 System.out.println("Student has failed.");
	 }
     // Test the actual input
     System.out.println("Passed => " + isPass.test(studentmarks));
   
	}

}






