package com.company;

import java.util.List;

public class Encrypter {
    public List<Encryption>  enAlgorithms;
    public List<Listener> listeners; //those listening for encrypted messages from the Encrypter class
    public Encrypter() {
    }

    //reference to an encryption
    //algorithm, the key that should be used with the encryption algorithm and a reference
    //to a listener. Listener is supposed to call this method passing the encryption algorithm
    //reference, the key and reference to itself (the listener).
    public void register(enAlgo, key, listener){

    }

    //send the encrpyted message to all its listeners (of course each
    //message is encrypted with the algorithm and the key the listener sent before with
    //registration)
    public void sendAll(String fileName){
        //open the file
        //then get the text
        //encrypt the message using 2 algo's
        //send messages to its listeners using its listener's encr algo(passed initially by its listeners via the register method).
    }
}
