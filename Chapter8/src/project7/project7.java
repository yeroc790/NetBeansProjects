/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

/**
 *
 * @author hansenc
 */
public class project7 {
    public static void main(String[] args) {
//        Sale s1, s2, s3;
//        DiscountSale d1, d2;
//        
//        s1 = new Sale("Club Crackers", 2.54);
//        s2 = new Sale("Cheetos", 3.31);
//        s3 = new Sale("Oreo", 2.98);
//        
//        d1 = new DiscountSale("Coca-Cola 12-pack", 4.88, 25);
//        d2 = new DiscountSale("Gatorade Fruit Punch 8-pack", 5.44, 15);
//        
//        MultiItemSale multi = new MultiItemSale(5);
//        multi.addSale(0, s1);
//        multi.addSale(1, s2);
        MultiItemSale cart = new MultiItemSale();
        cart.addSales();
        cart.calcBill();
        cart.displayTotalBill();
                
    }
}

//t = 2.54 + 3.31 + 2.98 + (0.75)4.88 + (0.85)5.44
//  = 8.83 + (0.75)4.88 + (0.85)5.44
//  = 8.83 + 3.66 + 4.62
//  = 17.11
