package org.learn;

import java.util.Base64;

public class ByteArrayExample {
    public static void main(String[] args) {
        String originalInput = "Hello, World!";

        // Convert string to byte array
        byte[] byteArray = originalInput.getBytes();

        // Print byte array
        System.out.println("Byte Array: ");

        for (byte b : byteArray) {
            System.out.print((char) b + " ");
        }
        System.out.println();

        // Convert byte array back to string
        String newString = new String(byteArray);
        System.out.println("Converted Back to String: " + newString);

        String endcoded = Base64.getEncoder().encodeToString(byteArray);
        System.out.println(endcoded);

        byte[] decoded = Base64.getDecoder().decode(endcoded);
        System.out.println(new String(decoded));


    }
}
