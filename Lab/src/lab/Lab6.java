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
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int row,i,n;
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number of rows: "); //User enters the number.
    n = scn.nextInt();
    for(row=1;row<=n;row++) //For loop for the rows, adding rows until reaching the number picked by user. 
   {
    for(i=1;i<=row;i++) //Another for loop ordering numbers as the amount of the number picked by user.
    System.out.print(i);
    System.out.println(" "); //Puts them to new lines.
    }
  }
}
