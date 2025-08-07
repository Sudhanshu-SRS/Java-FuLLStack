package pkg_26_07_2025_arrayDSandCollectionAPI;



public class Array1 {

	public static void main(String[] args) {
	 int sum=0;	
     int[] marks= {100,99,98,97,96};
    
//     for(int i=marks.length-1; i>=0;i--) {
     for(int i=0; i<marks.length;i++) {
    	 sum=+marks[i];
//    	 System.out.println(marks[i]);
    	 
     }
     System.out.println(sum);
     
     String[] city= {"Nagpur","Hyderbad","mumbai","chennai","bhandara"};
//     for(int i=0;i<city.length;i++) {
//    	 System.out.println(city[i]);
//     }
     int count=0;
     //enhaced loop 
     for(String cities:city) {
    	 count++;
    	 System.out.println(cities);
     }
     System.out.println("total count of cities is : "+count );
	}

}
