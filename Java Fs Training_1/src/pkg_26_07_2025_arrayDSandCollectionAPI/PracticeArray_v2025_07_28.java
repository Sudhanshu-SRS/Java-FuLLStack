package pkg_26_07_2025_arrayDSandCollectionAPI;

import java.util.Arrays;

public class PracticeArray_v2025_07_28 {

    // Method to print array in reverse order
    static void printReverse(int[] marks) {
        System.out.println("Marks in Reverse Order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }

    // Method to sort and display array
    static void sortAndDisplay(int[] marks) {
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(marks));
    }

    // Method to print ranks (highest to lowest)
    static void printRanks(int[] marks) {
        String[] rank = {"fifth", "fourth", "third", "second", "first"};
        System.out.println("Ranks from highest marks:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Rank is " + rank[i] + " : of " + marks[i] + " Marks");
        }
    }

    // Method to print marks with ascending ranks
    static void printMarksWithRanks(int[] marks) {
        String[] rank = {"first", "second", "third", "fourth", "fifth"};
        System.out.println("Marks with ranks:");
        for (int i = marks.length - 1, j = 0; i > 0 && j < rank.length; i--, j++) {
            System.out.println(marks[i] + " : " + rank[j] + " rank");
        }
    }

    public static void main(String[] args) {
        int[] marks = {100, 98, 99, 97, 96};

        printReverse(marks);
        sortAndDisplay(marks);
        printRanks(marks);
        printMarksWithRanks(marks);
    }
}
