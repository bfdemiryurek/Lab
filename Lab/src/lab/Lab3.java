/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Lenova
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scn= new Scanner(System.in); 
    int year; //Integer for the year that we will enter.
    System.out.println("Enter the year:");
    year=scn.nextInt();
    if(year%4==0){ // If statement for the leap year.
      System.out.println("It’s a Leap year yaaay!!!");  
    }
    else { // If the statement for the leap year is not correct, then else will function.
    System.out.println("It’s not a Leap year");
    } 
    
    
    }
    
}
