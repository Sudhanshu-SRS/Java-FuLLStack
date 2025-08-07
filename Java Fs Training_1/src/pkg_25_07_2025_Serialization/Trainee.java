/*Serialization-writing the state of an object outside JVM
as object is going to live inside JVM memory.
It will be garbage collected if not used by the code.
but we have a technique to write the state of an objectinstance varables) 
outside JVM- in a disk file or DB if you open that data its not human readable-so security is ensured.
The class must implement java.io. Srializable interface.
Its a marker method 
*/
package pkg_25_07_2025_Serialization;

import java.io.Serializable;

public class Trainee implements Serializable{
	public String empi_id=null;
	public String name=null;
	public int salary=0;
	public String toString() {
		return"This is an Instance Of Trainee"+this.empi_id+this.name+this.salary;
	}

	public static void main(String[] args) {

	}

}
