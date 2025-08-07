package pkg_31_07_2025_TestCompare;

public class TestCompare1 {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "godgle";
        System.out.println(s1.compareTo(s2)); // 'h' > 'g' => positive value (prints 1 or other positive depending on full string)

        String s3 = "star";
        System.out.println(s1.compareTo(s3)); // 'h' < 's' => negative value (prints -11)

        String s4 = "hello";
        System.out.println(s1.compareTo(s4)); // both strings are equal => prints 0
    }
}
