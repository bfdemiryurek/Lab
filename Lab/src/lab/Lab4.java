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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int num; //Integer of the code that user will pick.
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter your number:");// User picks the number.
    num=scn.nextInt();
    while(num>0){ // While loop that decreases the number picked by user until it reaches 0.
    System.out.println(num);
    num--;
    }
    }
    
}
