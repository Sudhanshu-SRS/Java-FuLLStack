package pkg_01_08_2025_methodRefrence;

public class MethodRef {

    // Ek method banaya re... jab thread chalega toh yeh bolega
    public static void methorreference() {
        System.out.println("1 Thread Is Running ...."); // Pehla thread bhaag raha hai bhau!
    }

    // Dusra method, dusra thread ke liye - chalu hone pe yeh chalega
    public static void methodreference1() {
        System.out.println("2 Thread Is Running....."); // Dusra thread bhi start hogaya re!
    }

    public static void main(String[] args) {
        // Thread banaya re... aur bola ki jaake methodreference1 ko run kar
        Thread t1 = new Thread(MethodRef::methodreference1);

        // Ab thread ko bol diya "bhaag re baba"
        t1.start(); // Start kar diya thread - ab yeh apna kaam karega background mein
    }
}
