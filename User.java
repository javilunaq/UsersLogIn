/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

import java.util.ArrayList;


/**
 *
 * @author jlunaque
 */
public class User {
    public String name;
    public String password;
    public String email;
    public String secQuestion;
    public ArrayList<Message> messagesSent = new ArrayList();
    public ArrayList<Message> messagesReceived = new ArrayList();
    
    
    public User(){
        name = "";
        password = "";
        email = "";
    }
    
    public User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
        secQuestion = "";
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecQuestion() {
        return secQuestion;
    }

    public void setSecQuestion(String secQuestion) {
        this.secQuestion = secQuestion;
    }

    public ArrayList<Message> getMessagesSent() {
        return messagesSent;
    }

    public void setMessagesSent(ArrayList<Message> messagesSent) {
        this.messagesSent = messagesSent;
    }

    public ArrayList<Message> getMessagesReceived() {
        return messagesReceived;
    }

    public void setMessagesReceived(ArrayList<Message> messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    
    
    
    
}
