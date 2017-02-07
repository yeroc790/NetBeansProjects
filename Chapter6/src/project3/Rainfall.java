/*
 * Compares average rainfall to actual rainfall for each month
 * User input for actual rainfall
 * Displays a table that shows how far from average each month's rainfall is
 */
package project3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class Rainfall {
    double[] averageRain = new double[12]; //one entry for each month
    double[] actualRain = new double[12];
    double[] difference = new double[12]; //difference between averageRain and actualRain, (actualRain - averageRain)
    
    public Rainfall(){ //defaults to 1 for each month
        for (int i = 0; i < 12; i++) {
            averageRain[i] = 1;
        }
    }
    
    public Rainfall(double[] a){
        if(a.length==12){
            for (int i = 0; i < 12; i++) {
                averageRain[i] = a[i];
            }
        }else{
            for (int i = 0; i < 12; i++) {
                averageRain[i] = 1;
            }
        }
    }
    
    public void setAverageRain(double[] a){
        if(a.length==12){
            for (int i = 0; i < 12; i++) {
                averageRain[i] = a[i];
            }
        }else{
            for (int i = 0; i < 12; i++) {
                averageRain[i] = 1;
            }
        }
    }
    
    //using a pre-existing array
    public void setActualRain(double[] a){
        if(a.length==12){
            for (int i = 0; i < 12; i++) {
                averageRain[i] = a[i];
            }
        }else{
            for (int i = 0; i < 12; i++) {
                averageRain[i] = 1;
            }
        }
        getDifference();
    }
    
    //using user input
    public void setActualRain(){
        for (int i = 0; i < 12; i++) {
            actualRain[i] = getInput(i);
        }
        getDifference();
    }
    
    private double getInput(int month){
        Scanner input = new Scanner(System.in);
        String monthString = convertMonth(month);
      
        System.out.println("Please enter the amount of rain that fell in " + monthString);
        if(input.hasNextDouble()){
            return input.nextDouble();
        }else{
            return 0;
        }
    }
    
    private void getDifference(){
        for (int i = 0; i < 12; i++) {
            difference[i] = actualRain[i] - averageRain[i];
        }
    }
    
    private String convertMonth(int a){ //'a' represents a month value
        String month = "";
        switch(a)
        {
            case 0: 
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
            default: 
                month = "ERROR";
                break;
        }
        return month;    
    }
    
    public void displayRainfall(){
        DecimalFormat num = new DecimalFormat("0.0");
        System.out.println("\nAverage Rainfall");
        for (int i = 0; i < 12; i++) {
            if(i!=11)
                System.out.print(averageRain[i] + ", ");
            else
                System.out.print(averageRain[i]);
        }
        System.out.println("\nActual Rainfall");
        for (int i = 0; i < 12; i++) {
            if(i!=11)
                System.out.print(actualRain[i] + ", ");
            else
                System.out.print(actualRain[i]);
        }
        System.out.println("\nDifference");
        for (int i = 0; i < 12; i++) {
            if(i!=11)
                System.out.print(num.format(difference[i]) + ", ");
            else
                System.out.print(num.format(difference[i]));
        }
    }
}
