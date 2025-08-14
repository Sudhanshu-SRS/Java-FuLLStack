package pkg_14_08_2025;

public class Array2_14_08_2025 {

    // Method to find maximum marks
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] marks = {89, 50, 23, 45, 67, 78, 90, 100, 34, 56};

        int max = findMax(marks);
        System.out.println("Maximum marks in the array: " + max);
    }
}
