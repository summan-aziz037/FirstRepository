package Package;

import java.util.HashMap;
import java.util.Map;

public class Decryption {

    private String decryptedText = "";
    private final int[] keylist;
    private final String cipherText;

    public Decryption(String message) {
        keylist = new int[]{6, 5, 1, 4, 3, 2, 1, 11, 4, 9, 8, 5};
        cipherText = message;
    }

    public String decryptionMethod(HashMap<Character, Integer> keyValueMap) {


        for (int i = 0; i < cipherText.length(); i++) {
            char charOfMessage = cipherText.charAt(i); // A
            int cipherIndex = 0;

            if (keyValueMap.containsKey(charOfMessage)) { // table ma sa jae or wo char check kary...
                cipherIndex = (keyValueMap.get(charOfMessage) - keylist[i]) % 26;
            }

            for (Map.Entry<Character, Integer> entrySet : keyValueMap.entrySet()) {

                if (cipherIndex == entrySet.getValue()) {
                    decryptedText = decryptedText + entrySet.getKey();
                    break;
                }
            }

        }
//        System.out.println("decryptedText = " + decryptedText);
        return decryptedText;
    }

}
