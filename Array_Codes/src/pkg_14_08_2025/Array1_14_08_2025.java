package pkg_14_08_2025;

public class Array1_14_08_2025 {

	public static void main(String[] args) {
int[] marks= {89,50,23,45,67,78,90,100,34,56};
	// Print the array elements
int max=marks[0];
for(int i=0;i<marks.length;i++) {
	if(marks[i]>max) {
		max=marks[i];
	}
                                 }
System.out.println("Maximum marks in the array: " + max);
	}

}
