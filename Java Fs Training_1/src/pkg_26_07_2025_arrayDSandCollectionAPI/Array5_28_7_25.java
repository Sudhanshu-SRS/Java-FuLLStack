package pkg_26_07_2025_arrayDSandCollectionAPI;

public class Array5_28_7_25 {
	 static int sumofelements(int[] marks){
		int sum=0;
	for(int i=0;i<marks.length;i++) {
		sum+=marks[i];
	}
		return sum;
	}
	 
	 // Method to find the biggest number
	    static int findMax(int[] marks) {
	        int max = marks[0];
	        for (int i = 1; i < marks.length; i++) {
	            if (marks[i] > max) {
	                max = marks[i];
	            }
	        }
	        return max;
	    }

	    // Method to find the lowest number
	    static int findMin(int[] marks) {
	        int min = marks[0];
	        for (int i = 1; i < marks.length; i++) {
	            if (marks[i] < min) {
	                min = marks[i];
	            }
	        }
	        return min;
	    }

	public static void main(String[] arg) {
		int[] marks= {98,99,97,96,95};
		int sum=sumofelements(marks);
		int max = findMax(marks);
		int min = findMin(marks);
		
		
		System.out.println("sum of all marks is : "+sum);	
		System.out.println("The Biggest Mark is :"+max);
		System.out.println("The Smallest Number Is :"+min);
	}	
}
