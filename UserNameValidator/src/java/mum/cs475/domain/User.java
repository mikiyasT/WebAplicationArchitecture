/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs475.domain;

/**
 *
 * @author Biwota
 */
public class User {
    
    int age;
    String usr;
    String pswd;
    int attempt;
    
    User(){
        attempt = 0;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setUsr(String usr){
        this.usr = usr;
    }
    public void setPswd(String pswd){
        this.pswd = pswd;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getUsr(){
        return this.usr;
    }
    public String getPswd(String pswd){
        attempt++;
        return this.pswd;
    }
    
    public int getAttempt(){
        return attempt;
    }
    
    
    
}
