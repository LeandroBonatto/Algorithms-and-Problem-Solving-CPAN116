/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentarrayutilities;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class AssignmentArrayUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array?");
        int size = scan.nextInt();
        double[] elements = new double[size];
        
        //get input for sales and put them in the array
        //find total of sales
        double total = 0;
        for(int i = 0; i < elements.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            elements[i] = scan.nextDouble();
            total += elements[i];
        }
        
        //display array elements
        for(int i = 0; i < elements.length; i++){
            System.out.println("Elements in array: ");
            System.out.println("" + elements[i]);
        }
        System.out.println("Total of sales: $" + total);
    }
    
}
