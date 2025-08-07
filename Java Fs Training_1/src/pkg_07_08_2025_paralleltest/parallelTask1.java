package pkg_07_08_2025_paralleltest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class parallelTask1 {

    public static void main(String[] args) {

        // Create two lists to store even (Maharashtra) and odd (India) numbers
        List<Integer> maharashtraList = new ArrayList<>();
        List<Integer> indiaList = new ArrayList<>();

        // Parallel stream to process numbers
        IntStream.range(1, 1000)
                .parallel()
                .forEach(i -> {
                    if (i % 2 == 0) {
                        System.out.println("Maharashtra: " + i);
                        synchronized (maharashtraList) {
                            maharashtraList.add(i);  // Add to Maharashtra list
                        }
                    } else {
                        System.out.println("India: " + i);
                        synchronized (indiaList) {
                            indiaList.add(i);  // Add to India list
                        }
                    }
                });

        // Print counts
        System.out.println("\nTotal Maharashtra count: " + maharashtraList.size());
        System.out.println("Total India count: " + indiaList.size());
    }
}
