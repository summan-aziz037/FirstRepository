package Package;

import java.util.HashMap;
import java.util.Scanner;

public class VermanCipher {

    public static void main(String[] args) {
        String cipherText = "";
        String decryptedText = "";

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<Character, Integer> keyValueMap = new HashMap<>();

        System.out.print("Insert the message : ");
        String message = new Scanner(System.in).next().toUpperCase();

        for (int index = 0; index < alphabets.length(); index++) {
            char ch = alphabets.charAt(index);
            keyValueMap.put(ch, index + 1);
        }
        Encryption encryption = new Encryption(message);
        cipherText = encryption.encryptionMethod(keyValueMap);

        System.out.println("cipherText = " + cipherText);

        Decryption decryption = new Decryption(cipherText);
        decryptedText = decryption.decryptionMethod(keyValueMap);

        System.out.println("decryptedText = " + decryptedText);
    }


}
