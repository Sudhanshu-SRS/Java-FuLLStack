package pkg_04_08_2025_Sets;

public class TeshHashcode_04_08_2025 {

	public static void main(String[] args) {
		String One="Aa";      //2112 assume in 7th bucket
		String Two="BB";     //2112 assume in 7th bucket
		
		//Same Hashcode does not mean same object 
		
		System.out.println("Hashcode of One: " + One.hashCode());
		System.out.println("Hashcode of Two: " + Two.hashCode());

	}

}
