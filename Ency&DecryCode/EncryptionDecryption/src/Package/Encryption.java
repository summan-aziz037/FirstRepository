package Package;

import java.util.HashMap;
import java.util.Map;

public class Encryption {
    private String cipherText = "";
    private final int[] keylist;
    private final String message;

    public Encryption(String message) {
        keylist = new int[]{6, 5, 1, 4, 3, 2, 1, 11, 4, 9, 8, 5};
        this.message = message;
    }

    public String encryptionMethod(HashMap<Character, Integer> keyValueMap) {

        for (int i = 0; i < message.length(); i++) {
            char charOfMessage = message.charAt(i); // A
            int cipherIndex = 0;

            if (keyValueMap.containsKey(charOfMessage)) { // table ma sa jae or wo char check kary...
                cipherIndex = (keyValueMap.get(charOfMessage) + keylist[i]) % 26;
            }

            for (Map.Entry<Character, Integer> entrySet : keyValueMap.entrySet()) {

                if (cipherIndex == entrySet.getValue()) {
                    cipherText = cipherText + entrySet.getKey();
                    break;
                }
            }

        }
        return cipherText;
    }


}
