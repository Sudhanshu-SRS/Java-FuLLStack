package pkg_01_08_2025_encodingdecoding;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

// It started in JDK 8. Encoding/Decoding is used to convert data from one format to another.
public class Encoding_Decoding1 {

    public static void main(String[] args) {
        String name = "Sudhanshu";
        
        System.out.println("Original Name: " + name);

        // Encoding
        Encoder encoder = Base64.getEncoder();
        String encodedName = encoder.encodeToString(name.getBytes());
        System.out.println("Encoded Name: " + encodedName);

        // Decoding
        String encodedString = "U3VkaGFuc2h1"; // Example encoded string
        Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encodedName);  // Use same encoded string
        String decodedName = new String(decodedBytes);
        System.out.println("Decoded Name: " + decodedName);
    }
}
// Output: