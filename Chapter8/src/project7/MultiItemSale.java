/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class MultiItemSale {
    private Sale[] items;
    private double bill;
    
    public MultiItemSale(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("How many items are you purchasing?");
        num = input.nextInt();
        
        items = new Sale[num];
    }
    
    public MultiItemSale(int num){
        if(num>0){
            items = new Sale[num];
        }else{
            System.out.println("Error: Invalid Index");
            System.exit(0);
        }
    }
    
    public void addSale(int index, Sale sale){
        try{
            items[index] = sale;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
            System.exit(0);
        }
    }
    
    public void addSale(int index){
        items[index] = inputSale();
    }
    
    public void addSales(){
        for (int i = 0; i < items.length; i++) {
            System.out.println("\n-- Item " + (i+1) + " --");
            items[i] = inputSale();
        }
    }
    
    public Sale[] getItems(){
        return items.clone();
    }
    
    public void calcBill(){
        bill = 0;
        for(Sale temp : items)
            bill += temp.bill();
    }
    
    public void setBill(double newBill){
        bill = newBill;
    }
    
    public double getBill(){
        return bill;
    }
    
    private Sale inputSale(){
        String name, toss;
        char sale;
        double price, discount;
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the name of your item?");
        name = input.nextLine();
//        toss = input.nextLine();
        
        System.out.println("\nWhat is the price?");
        price = input.nextDouble();
        
        System.out.println("\nIs it on sale? (y or n)");
        sale = input.next().charAt(0);
        sale = Character.toLowerCase(sale);
        
        if(sale == 'y'){
            System.out.println("\nEnter the percentage of the discount");
            discount = input.nextDouble();
            
            DiscountSale newSale = new DiscountSale(name, price, discount);
            return newSale;
        }else if(sale == 'n'){
            Sale newSale = new Sale(name, price);
            return newSale;
        }else{
            System.out.println("Error: Invalid responce");
            System.exit(0);
            return null;
        }
    }
    
    public void displayTotalBill(){
        Sale demoSale = new Sale();
        DiscountSale demoDiscount = new DiscountSale();
        
        DecimalFormat percent = new DecimalFormat("0.0");
        DecimalFormat dollar = new DecimalFormat("0.00");
        
        System.out.println("You purchased the following items:");
        for(Sale temp : items){
            if(temp.getClass()==demoSale.getClass()){
                System.out.println(temp.getName() + " - $" + dollar.format(temp.getPrice()));
            }else if(temp.getClass()==demoDiscount.getClass()){
                System.out.println(temp.getName() + " - $" + dollar.format(temp.getPrice()) + " - " + percent.format(temp.getDiscount()) + "% off");
            }else{
                System.out.println("Error: temp does not match the available class types");
                System.exit(0);
            }
        }
        
        System.out.println("\nYour total: $" + dollar.format(bill));
    }
}
