/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author hansenc
 */
public class Person {
    private String name;
    private int pop; //popularity: the index of the file
    private int num; //number of times the name is used
    
    public Person(){
        name = null;
        pop = 0;
        num = 0;
    }
    
    public Person(String name, int pop, int num){
        this.name = name;
        this.pop = pop;
        this.num = num;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPop(int pop){
        this.pop = pop;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPop(){
        return pop;
    }
    
    public int getNum(){
        return num;
    }
}
