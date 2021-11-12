package vigenere;

import java.util.Arrays;

public class Vigenere {


    public String chiffrement(String string,String key) {

        String[] stringSeparated = string.split("");
        String encryptedString = "";

        for(int i =0 ; i<string.length();i++){

            int elementString =(int) string.toLowerCase().charAt(i);
            int elementKey =(int) key.toLowerCase().charAt(i);
            elementString+=elementKey;
            while(elementString>122){
                elementString-=122;
            }
            if(elementString<=97)
                elementString+=25;
            else
                elementString--;
            encryptedString+=Character.toString((char)(elementString));
        }

        return encryptedString;

    }

    public static String dechiffrement(String text, String key)
    {
        StringBuffer sb = new StringBuffer(text);

        for(int i = 0; i < text.length(); i++)//
        {
            int decalage = (int)key.charAt(i % key.length()) - 97;

            int currentLetter = (int)text.charAt(i);
            if(currentLetter - decalage < 97)
                currentLetter += 26;

            int newCharCode = (currentLetter - 97 - decalage) % 26 + 97;
            sb.setCharAt(i, (char)newCharCode);
        }

        text = sb.toString();
        return text;
    }
}
