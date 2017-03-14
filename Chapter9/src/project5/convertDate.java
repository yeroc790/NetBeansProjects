/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.util.Scanner;

/**
 *
 * @author hansenc
 */
public class convertDate {
    private int month, day, year;
    private String monthString;
    
    public convertDate(){
        //run input
        boolean again = true;
        while(again == true)
        try{
            again = false;
            input(); //loop input while it catches errors
        }catch(MonthException e){
            System.out.println("Error: " + e.getMessage());
            again = true;
        }catch(DayException e){
            System.out.println("Error: " + e.getMessage());
            again = true;
        }catch(YearException e){
            System.out.println("Error: " + e.getMessage());
            again = true;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            again = true;
        }
    }
    
    public convertDate(int month, int day, int year){
        //run setMonth() etc. with exception handling
        try{
            setMonth(month);
            setDay(day, month, year);
            setYear(year);
        }catch(MonthException e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }catch(DayException e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }catch(YearException e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }  
    }
    
    public void setMonth(int month) throws MonthException{
        if(checkMonth(month)==true){
            this.month = month;
        }else{
            throw new MonthException();
        }
    }
    
    public boolean checkMonth(int month){
        if((month<1)||(month>12)){
            return false;
        }else{
            return true;
        }
    }
    
    public void setYear(int year) throws YearException{
        if(checkYear(year)==true){
            this.year = year;
        }else{
            throw new YearException();
        }
    }
    
    public boolean checkYear(int year){
        if((year<1000)||(year>3000)){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean checkDay(int day, int numDays){
        if((day<1)||(day>numDays)){
            return false;
        }else{
            return true;
        }
    }
    
    private int getNumDays(int day, int month, int year){
        int numDays = 0;
        if(checkMonth(month)){
            switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        numDays = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        numDays = 30;
                        break;
                    case 2:
                        if (((year % 4 == 0) && 
                             !(year % 100 == 0))
                             || (year % 400 == 0))
                            numDays = 29;
                        else
                            numDays = 28;
                        break;
                }
        }else{
            System.out.println("Error: Invalid Month");
            System.exit(0);
        }
        
        return numDays;
    }
    
    public void setDay(int day, int month, int year) throws DayException, MonthException, YearException{
        int numDays;
        if(checkYear(year)){
            if(checkMonth(month)){
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        numDays = 31;
                        if(checkDay(day,numDays))
                            break;
                        else
                            throw new DayException();
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        numDays = 30;
                        if(checkDay(day,numDays))
                            break;
                        else
                            throw new DayException();
                    case 2:
                        if (((year % 4 == 0) && 
                             !(year % 100 == 0))
                             || (year % 400 == 0))
                            numDays = 29;
                        else
                            numDays = 28;
                        if(checkDay(day,numDays))
                            break;
                        else
                            throw new DayException();
                }
            }else{
                throw new MonthException();
            }
        }else{
            throw new YearException();
        }
    }
    
    private void input() throws MonthException, DayException, YearException, Exception{
        Scanner input = new Scanner(System.in);
        String dateString, dayString, monthString, yearString;
        int newDay = 0, newMonth = 0, newYear = 0;
        
        System.out.println("Please enter the date in the following format: mm/dd/yyyy");
        dateString = input.next();
        
        monthString = dateString.substring(0,2);
        if(monthString.indexOf('/')>0){
            //throw error for not putting 2 digits for month
            throw new Exception("Month is not 2 digits");
        }
        
        dayString = dateString.substring(3,5);
        if(dayString.indexOf('/')>0){
            //throw error for not putting 2 digits for day
            throw new Exception("Day is not 2 digits");
        }
        
        yearString = dateString.substring(6);
        if(yearString.length()!=4){
            //throw error for not putting 4 digits for year
            throw new Exception("Year is not 4 digits");
        }
        
        try{
            newDay = Integer.parseInt(dayString);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
        
        try{
            newMonth = Integer.parseInt(monthString);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
        
        try{
            newYear = Integer.parseInt(yearString);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
        
        if(checkYear(newYear))
            year = newYear;
        else
            throw new YearException();
        
        if(checkMonth(newMonth))
            month = newMonth;
        else
            throw new MonthException();
        
        
        if(checkDay(newDay, getNumDays(newDay, newMonth, newYear)))
            day = newDay;
        else
            throw new DayException();
    }
    
    public void display(){
        convertMonth();
        System.out.println(monthString + " " + day + ", " + year);
    }
    
    private void convertMonth(){
        switch(month){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
    }
}
