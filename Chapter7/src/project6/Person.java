/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author hansenc
 */
public class Person {
    private String name;
    
    public Person(){
        name = "";
    }
    
    public Person(String theName){
        name = theName;
    }
    
    public Person(Person theObject){
        name = theObject.getName();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String theName){
        name = theName;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
