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
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int a; //Integer of the code.
    String b = "@"; //@'s that we will make a triangle.
    Scanner scn = new Scanner(System.in); 
    System.out.print("Enter the number of @'s: "); //User will determine the number of rows.
    a = scn.nextInt();
    for(int i = 1; i <= a; i++) //For loop for the rows, adding rows until reaching the number picked by user. 
    {
    for(int c = 1; c <= i; c++) //Another for loop adding @ sign as the amount of the number picked by user.
    {
    System.out.print(b); //Prints @.
    }
    System.out.println(" "); //Puts them to new lines.
    }
  }
}