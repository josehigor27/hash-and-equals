package exemple02;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashExemple {
    public static String calculateMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xFF & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception
            return null;
        }
    }

    public static String generateShortHash(String input, int length) {
        String fullHash = calculateMD5Hash(input);
        if (fullHash == null || fullHash.length() < length) {
            return null; // Unable to generate short hash
        }
        return fullHash.substring(0, length);
    }

}
