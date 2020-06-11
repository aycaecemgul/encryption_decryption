package com.company;

import java.util.ArrayList;

public class Encrypter {
    public ArrayList<Encryption> enAlgorithms;
    public ArrayList<Listener> listeners; //those listening for encrypted messages from the Encrypter class
    public Encrypter() {
        enAlgorithms=new ArrayList<Encryption>();
        listeners=new ArrayList<Listener>();
    }

    //type of key??
    // listeners use to
    //register themselves so that they can get encrypted messages from an
    //Encrypter object.
    public void register(Encryption enAlgo,String key, Listener listener){

    }

    //send the encrpyted message to all its listeners (of course each
    //message is encrypted with the algorithm and the key the listener sent before with
    //registration)

    // In the sendAll message you need to loop through all the listeners and call
    //their update message to pass each one its encrypted message. Inside the update
    //method of the listener object you need to decrypt the message and print to
    //the console to see the plain text.
    public void sendAll(String fileName){
        //open the file
        //then get the text
        //encrypt the message using 2 algo's
        //send messages to its listeners using its listener's encr algo(passed initially by its listeners via the register method).


    }

    public void add(Encryption e){
        enAlgorithms.add(e);
    }
}
