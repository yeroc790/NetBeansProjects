/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hansenc
 */
public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        Airplane yourPlane = new Airplane(256, "Silver", 1999, 4, "jet", 200);
        
        myCar.setMaxSpeed(200);
        myCar.setColor("Orange");
        myCar.setYear(1970);
        myCar.setManufacturer("Lamborghini");
        myCar.setModel("Muira");
        myCar.setEngine("V8");

        System.out.println(myCar.toString());
        System.out.println(yourPlane.toString());
    }
}
