/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

/**
 *
 * @author jlunaque
 */
public class Message {
    
    public String text;
    protected User transmitter;
    protected User receiver;
    protected boolean read;
    
    public Message(){
        
    }
    
    public Message(String message, User transmitter, User receiver){
        this.text = message;
        this.transmitter = transmitter;
        this.receiver = receiver;
        this.read = false;
        
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = text;
    }

    public User getTransmitter() {
        return transmitter;
    }

    public void setTransmitter(User transmitter) {
        this.transmitter = transmitter;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
    
    
    
}
