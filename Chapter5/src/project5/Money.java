/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.text.DecimalFormat;

/**
 *
 * @author hansenc
 */
public class Money {
    private int dollars;
    private int cents;
    
    public Money(){
        dollars = 0;
        cents = 0;
    }
    
    public Money(int newDollars, int newCents){
        dollars = newDollars;
        cents = newCents;
    }
    
    public Money(int newDollars){
        dollars = newDollars;
        cents = 0;
    }

    public int getDollars(){
        return dollars;
    }
    
    public int getCents(){
        return cents;
    }
    
    public void setDollars(int newDollars){
        dollars = newDollars;
    }
    
    public void setCents(int newCents){
        if(newCents<=100){
            cents = newCents;
        }else{
            cents = 0;
        }
    }
    
    public void displayMoney(){
        DecimalFormat centForm = new DecimalFormat("00");
        System.out.println("You have $" + dollars + "." + centForm.format(cents));
    }
    
    public Money add(Money money1, Money money2){
        int dollar_sum, cent_sum;
        int remainder;
        Money sum = new Money();
        
        dollar_sum = money1.getDollars() + money2.getDollars();
        cent_sum = money1.getCents() + money2.getCents();
        
        remainder = (int) Math.floor(cent_sum/100); //in case there are extra cents
        for (int i = 0; i < remainder; i++) {
            cent_sum -= 100;
            dollar_sum++;
        }
        
        sum.setDollars(dollar_sum);
        sum.setCents(cent_sum);

        return sum;
    }
    
    public Money subtract(Money money1, Money money2){
        Money difference = new Money();
        int dollarDiff, centDiff;
       
        dollarDiff = money1.getDollars() - money2.getDollars();
        centDiff = money1.getCents() - money2.getCents();
        
        if(dollarDiff>0)
        {
            if(centDiff<0){
                centDiff = (money1.getCents() + 100) - money2.getCents();
                dollarDiff--;
            }
            difference.setDollars(dollarDiff);
            difference.setCents(centDiff);
        }else{
            difference.setDollars(0);
            difference.setCents(0);
        }
        return difference;
    }
}
