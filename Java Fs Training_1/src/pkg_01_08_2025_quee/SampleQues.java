package pkg_01_08_2025_quee;

import java.util.LinkedList;
import java.util.Queue;

public class SampleQues {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.add("Sudhanshu");
		name.add("Mansi");
		name.add("Pranay");
		
System.out.println("Current Queue Is: "+name);

//Peek Into Queue without removing elemets
String Dekhna =name.peek();
System.out.println("Head Of Queue Is Bole to Top Queue ka : "+Dekhna);

//Poll Into Queue i.e Remove element From Queue(Dequeue)
String NameNikal=name.poll();
System.out.println("Name Removed I.e Name Kiska Nikla Top Se :"+NameNikal);
System.out.println("Queue se Name Nikalne Ke Badd :"+name);

//Name Adding After Removing
name.add("Utkarsha");
name.add("fulanshu");
name.add("girgit");

//check after Adding elements
System.out.println("Name Add Krne KE BAdd Dekh Queue Ko : "+name);

//Check If Queue Is Empty Or Not
boolean isEmpty =name.isEmpty();
System.out.println("Dekh To Queue Empty hai Ya Nahi ? \n"+isEmpty);

	}
}
