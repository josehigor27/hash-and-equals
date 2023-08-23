package exemple03;

import java.util.Random;

public class ShortHashExemple {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()-_+";
    private static final int STRING_LENGTH = 7;

    public static String generateUniqueString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < STRING_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
