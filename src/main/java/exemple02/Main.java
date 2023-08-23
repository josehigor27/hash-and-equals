package exemple02;

import static exemple02.HashExemple.calculateMD5Hash;
import static exemple02.HashExemple.generateShortHash;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int desiredLength = 7;
        System.out.println("Método MD5");
        String hash = calculateMD5Hash(input);
        System.out.println("Input: " + input);
        System.out.println("MD5 Hash: " + hash);
        System.out.println("----------------------");
        System.out.println("Hash reduzido");
        String shortHash = generateShortHash(input,desiredLength);
        if (shortHash != null) {
            System.out.println("Input: " + input);
            System.out.println("Short Hash (" + desiredLength + " chars): " + shortHash);
        } else {
            System.out.println("Unable to generate short hash.");
        }
//https://urx1.com/yE4UK
    }
}
