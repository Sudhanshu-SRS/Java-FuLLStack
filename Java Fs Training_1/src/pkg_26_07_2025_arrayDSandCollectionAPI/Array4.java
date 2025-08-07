package pkg_26_07_2025_arrayDSandCollectionAPI;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] ar3) {
		int[] marks= {100,98,99,97,96};
		 System.out.println("Marks in Reverse Order:");
		 for(int i=marks.length-1;i>=0;i--) {
			
			System.out.println(marks[i]);
		}
		
		System.out.println("before Swapping");
		System.out.println(Arrays.toString(marks));
		System.out.println("After Swapping");
        Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));
		String[] rank={"fifth","fourth","third","second","first"};
		 for (int i=marks.length-1;i>=0;i--) {
			
			 System.out.println("Rank is "+rank[i]+ " : of "+marks[i]+" Marks");
		 }
		 String[] rank1={"first","second","third","fourth","fifth"};
		 for (int i=marks.length-1,j=0;i>0&&j<rank1.length;i--,j++) {
			
			 System.out.println(marks[i]+ " :  "+rank1[j]+" rank");
		 }
		
	}}


