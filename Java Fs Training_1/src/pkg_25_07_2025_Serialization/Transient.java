package pkg_25_07_2025_Serialization;

import java.io.Serializable;

public class Transient implements Serializable{
	public String empi_id=null;
	public String name=null;
	public transient int salary=0;
	public String toString() {
		return"This IS the Instance Of Trainee"+this.empi_id+this.name+this.salary;
	}
	public static void main(String[] args) {
		
	}

}
