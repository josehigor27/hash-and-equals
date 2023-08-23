package exemple01;

public class Main {
    public static void main(String[] args) {

        KeyGenerator keyGenerator = new KeyGenerator();
        for (int i = 0; i<10;i++){
            String uniqueKey = keyGenerator.generateUniqueKey();
            System.out.println("Generated Key " + (i + 1) + ": " + uniqueKey);
        }
    }
}