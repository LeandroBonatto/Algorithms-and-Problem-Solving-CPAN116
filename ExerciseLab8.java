/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciselab8;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class ExerciseLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // This method accepts an integer array as an argument.
           // Loop counter
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter size of array: ");
           int numSize = scan.nextInt();
  	// Accumulator, initialized to 0
           int[] size = new int [numSize];
           

   	// Calculate the total of the array elements.
           int total = 0;
           for(i = 0; i < size.length; i++){	
               System.out.println("Enter number: " (i + 1));
               size[i] = scan.nextInt();
               total += size[i];
            }
           for(int i = 0; i < size.length; i++){
               System.out.println("Elements in array:" + size[i]);
                 
           }
           
           System.out.println("Sum of array elements: " + total);
    }

}

 
