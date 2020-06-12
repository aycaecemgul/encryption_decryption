package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encrypter {
    public List<Encryption> enAlgorithms;
    public List<Listener> listeners; //those listening for encrypted messages from the Encrypter class
    public List keys;

    public Encrypter() {
        enAlgorithms=new ArrayList<Encryption>();
        listeners=new ArrayList<Listener>();
        keys=new ArrayList();
    }

    public void register(Encryption enAlgo,byte key, Listener listener){
        listeners.add(listener);
        keys.add(key);
        enAlgorithms.add(enAlgo);

    }

    public void sendAll(String fileName) throws FileNotFoundException {
        //open the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        //then get the text
        String text = inputFile.toString();
        for(int i=0;i<listeners.size();i++){
            //encrypt according to the listener
            listeners.get(i).encAlgo.encrypt(text, (byte) keys.get(i));

        }

    }

}
