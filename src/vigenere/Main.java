package vigenere;

public class Main{
    public static void main(String[] args) {

        Vigenere vigenere = new Vigenere();
        String string = "helloiamthegreatpersonintheworld";
        System.out.println("chaine à chiffrer : "+string);
        String encryptedString = vigenere.chiffrement(string,"areyousureaboutthatoryoumadejoke");
        String decryptedString = vigenere.dechiffrement(encryptedString,"areyousureaboutthatoryoumadejoke");
        System.out.println("chiffrement : "+ encryptedString +"\n" +"dechiffrement : " + decryptedString);
    }
}
