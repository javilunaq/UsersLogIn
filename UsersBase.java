/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jlunaque
 */
public class UsersBase {

    HashMap<String, User> dataBase = new HashMap<String, User>();   // hash map es como un diccionario en python
    public ArrayList<String> messages = new ArrayList();
    
    public int register(String member, String password, String email) {  // el usuario se registra si no lo está
        User user = new User(member, password, email);
        if (!dataBase.containsValue(user)) {
            dataBase.put(user.name, user);
            return 1;                                    // si no estas registrado devuelves 1
        } else {
            return 0;                                    // si estas registrado devuelves 0
        }

    }

    public boolean logInMember(String member) {
        boolean result = false;
       
        if (dataBase.containsKey(member)){
            result = true;
        }
        
        return result;
        
    }
    
    public boolean logInPassword(String member, String loginpassword){
        boolean result = false;
        if(loginpassword.equals(dataBase.get(member).password)){
            result = true;
        }
        
        return result;
        
    }
    
    public void sendText(Message text){
        text.receiver.messagesReceived.add(text);
        text.transmitter.messagesSent.add(text);
        
    }

}
