package pkg_31_07_2025_reflection;

//print all public methods 
import java.util.*;
import java.lang.reflect.*;

class TestReflection3 {
    public static void main(String ar[]) {
        try {
            Method[] publicMethods = Class.forName("java.lang.Object").getMethods();
            
            // prints all public methods of Object using Arrays.toString()
            System.out.println(Arrays.toString(publicMethods));
            System.out.println("----------");

            // printing methods one by one
            for (int i = 0; i < publicMethods.length; i++) {
                System.out.println(publicMethods[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
