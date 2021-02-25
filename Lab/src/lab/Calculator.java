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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    //I made 4 static methods. These are the 4 basic methods of a calculator.
    public static int subt(int x, int y) { //Method for subtraction.
    int result=x-y;
    return result;
    }
    public static int add(int x, int y) {//Method for addition.
    int result=x+y;
    return result;
    }
    public static int mult(int x, int y) {//Method for multipication.
    int result=x*y;
    return result;
    }
    public static int div(int x, int y) {//Method for division.
    int result=x/y;
    return result;
    }

    public static void main(String[] args) {
    // TODO code application logic here
    int cal,x,y;  // These are my 3 different ints.Cal for method number,x,y for numbers.
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter your calculation method number:"); //I want user to pick the calculation type.
    cal=scn.nextInt();
    System.out.println("Enter your first number"); //I want user to pick the first number.
    x=scn.nextInt();
    System.out.println("Enter your second number");//I want user to pick the second number.
    y=scn.nextInt();
    if(cal==1) // If user picks number one, then it makes subtraction.
    {
    System.out.println("Subraction of the numbers is " + subt(x,y));
    }
    if(cal==2) // If user picks number one, then it makes addition.
    {
    System.out.println("Sum of the numbers is " + add(x,y));
    }
    if(cal==3) // If user picks number one, then it makes multipication.
    {
    System.out.println("Multiplication of the numbers is " + mult(x,y));
    }
    if(cal==4) // If user picks number one, then it makes division.
    {
    System.out.println("Division of the numbers is " + div(x,y));
    }
    }
    
}
