/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.business;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String heardFrom;
    private String via;
    private String updates;

public User(){
    firstName = "";
    lastName = "";
    email = "";
    heardFrom = "";
    via = "";
    updates = "";
}
public User(String firstName, String lastName, String email, String heardFrom, String updates, String via){
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.heardFrom = heardFrom;
    this.updates = updates;
    this.via = via;
}

public String getFirstName(){
    return firstName;
}

public void setFirstName(String firstName){
     this.firstName = firstName;
}

public String getLastName(){
    return lastName;
}

public void setLastName(String lastName){
     this.lastName = lastName;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
     this.email = email;
}

public String getHeardFrom(){
    return heardFrom;
}

public void setHeardFrom(String heardFrom){
     this.heardFrom = heardFrom;
}

public String getUpdates(){
    return updates;
}

public void setUpdates(String updates){
     this.updates = updates;
}

public String getVia(){
    return via;
}

public void setVia(String via){
     this.via = via;
}
}
