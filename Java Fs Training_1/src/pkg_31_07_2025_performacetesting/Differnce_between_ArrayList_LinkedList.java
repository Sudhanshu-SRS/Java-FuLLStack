
package pkg_31_07_2025_performacetesting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Differnce_between_ArrayList_LinkedList {

    public static void main(String[] args) {
        int size = 100000;
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // ADD Operation
        System.out.println("==== ADD Operation ====");
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Add: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Add: " + (endTime - startTime) + " ns");

        // GET Operation (access middle element repeatedly)
        System.out.println("\n==== GET Operation ====");
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.get(size / 2);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Get (middle): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.get(size / 2);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Get (middle): " + (endTime - startTime) + " ns");

        // REMOVE Operation - from START
        System.out.println("\n==== REMOVE Operation (START) ====");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Remove from Start: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Remove from Start: " + (endTime - startTime) + " ns");

        // REMOVE Operation - from MIDDLE
        System.out.println("\n==== REMOVE Operation (MIDDLE) ====");
        int middle = arrayList.size() / 2;
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(middle);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Remove from Middle: " + (endTime - startTime) + " ns");

        middle = linkedList.size() / 2;
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(middle);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Remove from Middle: " + (endTime - startTime) + " ns");

        // REMOVE Operation - from END
        System.out.println("\n==== REMOVE Operation (END) ====");
        startTime = System.nanoTime();
        for (int i = arrayList.size() - 1; i >= arrayList.size() - 1000; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Remove from End: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = linkedList.size() - 1; i >= linkedList.size() - 1000; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Remove from End: " + (endTime - startTime) + " ns");
    }
}
