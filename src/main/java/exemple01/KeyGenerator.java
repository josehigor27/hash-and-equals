package exemple01;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class KeyGenerator {
    private Set<String> generatedKeys = new HashSet<>();
    public String generateUniqueKey(){
        String key;
        do {
            key = UUID.randomUUID().toString();
        }while(generatedKeys.contains(key));
        generatedKeys.add(key);
        return key;
    }

}
