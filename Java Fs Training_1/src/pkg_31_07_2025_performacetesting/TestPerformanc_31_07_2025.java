package pkg_31_07_2025_performacetesting;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestPerformanc_31_07_2025 {

	public static void main(String[] args) {
		ArrayList Al =new ArrayList();
		LinkedList LL =new LinkedList();
		
		//item Added In ArrayList
		long Starttime=System.nanoTime();
		for(int i=0;i<1000000;i++) {
			Al.add(i);
		}
		long Endtime=System.nanoTime();
		long Duration=Endtime-Starttime;
		System.out.println("THe Duration Of ArrayList ADD :"+Duration);
		
		//Item Added In Linked List
		 Starttime=System.nanoTime();
		for(int i=0;i<1000000;i++) {
			LL.add(i);
		}
		 Endtime=System.nanoTime();
		 Duration=Endtime-Starttime;
		System.out.println("THe Duration Of LinkedList ADD :"+Duration);
		

	}

}
