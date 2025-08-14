package pkg_14_08_2025;

public class Array3_14_08_2025_Charecter_repeat {

    public static void main(String[] args) {
        String name = "Sudhanshu"; // Mama, yaha apun ka name set kela
        char[] nameCharArray = name.toCharArray(); // String la character  array madhe todun takla
        int length = nameCharArray.length; // Kitne character aahe te count kela

        System.out.println("Characters in the name: " + name);

        // Ek-ek character check karna start kela re mama
        for (int i = 0; i < length; i++) {
            int charCount = 0; // Count reset kela
            boolean alreadyCounted = false; // Pehle se check kela ka nahi flag

            // Pehle ka character aahe ka, double counting nahi karecha re mama
            for (int k = 0; k < i; k++) {
                if (nameCharArray[i] == nameCharArray[k]) {
                    alreadyCounted = true; // Aree pehle mil gaya re, aage jao
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // Skip kar diya, next character pe jao
            }

            // Abhi poora array madhe kitne time aaya te count kela
            for (int j = 0; j < length; j++) {
                if (nameCharArray[i] == nameCharArray[j]) {
                    charCount++; // Ek count add kar diya
                }
            }

            // Jo repeat hota te print kara mama
            if (charCount > 1) {
                System.out.println("Character '" + nameCharArray[i] + "' is repeated " + charCount + " times.");
            }
        }
    }
}
