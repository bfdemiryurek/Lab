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
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int a,b; // Two different numbers that we want user to pick.
    Scanner scn = new Scanner(System.in);
    System.out.print("Pick your first number:"); // User picks number one.
    a=scn.nextInt();
    System.out.print("Pick your second number:"); // User picks number one.
    b=scn.nextInt();
    System.out.println("Sum:" + (a+b)); // Two numbers picked by user are added here and printed.

    }
    
}
