/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author hansenc
 */
public class project5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6,9);
        rect.draw(0,0);
        rect.display();
        
        rect.center();
        rect.display();
        
        Triangle tri = new Triangle();
        tri.draw(0,0);
        tri.display();
        
        tri.center();
        tri.display();
    }
}
