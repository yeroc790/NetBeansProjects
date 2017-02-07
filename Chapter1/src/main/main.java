/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import project1.project1;
import project2.project2;
import project4.project4;
import project7.project7;

/**
 *
 * @author hansenc
 */
public class main {
    public static void main(String[] args) {
        project1 p1 = new project1();
        project2 p2 = new project2();
        project4 p4 = new project4();
        project7 p7 = new project7();
        
        System.out.println("-- Project 1 --");
        p1.main(args);
        System.out.println("\n-- Project 2 --");
        p2.main(args);
        System.out.println("\n-- Project 4 --");
        p4.main(args);
        System.out.println("\n-- Project 7 --");
        p7.main(args);
    }
}
