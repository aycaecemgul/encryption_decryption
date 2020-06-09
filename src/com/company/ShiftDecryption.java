package com.company;

public class ShiftDecryption implements Decryption {
    @Override
    public String decrypt(String encryptedText, byte key) {
        char[] array=encryptedText.toCharArray();
        char[] decArray = new char[array.length];
        int[] asciiArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            asciiArray[i]=(int) array[i];
            asciiArray[i]=asciiArray[i]+key;
            decArray[i]= (char) asciiArray[i];
        }
        String text = new String(decArray);
        return text;
    }
}
