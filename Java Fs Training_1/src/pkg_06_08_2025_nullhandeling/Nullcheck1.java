package pkg_06_08_2025_nullhandeling;

public class Nullcheck1 {

    String s1=null; // Instance variable

    public static void main(String[] args) {
        clearScreen(); // Clear screen before running anything

        // Null check demo
        String s; // Local variable, must be initialized before use

        // This line will cause a compile-time error because 's' is not initialized:
        // System.out.println(s);

        Nullcheck1 n = new Nullcheck1();

        // Will print: null (no NullPointerException because it's instance variable)
        System.out.println("\nn.s1 = " + n.s1); 

        // Uncommenting below line would cause compile-time error due to uninitialized 's'
        // System.out.println("Uninitialized local s = " + s);
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing screen: " + e.getMessage());
        }
    }
}
