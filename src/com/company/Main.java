package com.company;

public class Main {

    public static void main(String[] args) {
        String text="the attack will start at five am";
        System.out.println( shiftdec(text, (byte) 1));
        text=shiftdec(text, (byte) 1);

    }
    //test methods
    public static String shiftdec(String encryptedText, byte key){
        ShiftDecryption s = new ShiftDecryption();
        return s.decrypt(encryptedText,key);
    }
    public static String shiftenc(String encryptedText, byte key){
        ShiftEncryption s = new ShiftEncryption();
        return s.encrypt(encryptedText,key);
    }
    public static String binenc(String text,byte key){
        BinaryEncryption bE= new BinaryEncryption();
        return bE.encrypt(text,key);
    }
}
