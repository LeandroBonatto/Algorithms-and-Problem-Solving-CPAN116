
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class ArraysTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. an array variable of type integer with size 30
        int[] scores = new int[30];
        //2. an array variable of type double with size 7
        double numbers[] = new double[7];
        //3. an array variable of type String with size 5
        String names[] = new String[5];
        //4. initialize names array
        names[0] = "David";
        names[1] = "Fred";
        names[2] = "Lynda";
        names[3] = "Rachel";
        names[4] = "Amrit";

        //5. total sales algorithm using arrays
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sales do you have?");
        int size = scan.nextInt();
        double[] sales = new double[size];
        
        //get input for sales and put them in the array
        //find total of sales
        double total = 0;
        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter sale " + (i + 1) + ": ");
            sales[i] = scan.nextDouble();
            total += sales[i];
        }
        
        //display array elements
        for(int i = 0; i < sales.length; i++){
            System.out.println("Sale " + (i + 1) + ": " + sales[i]);
        }
        System.out.println("Total of sales: $" + total);
        
        //6. Another way to declare and initialize an array
        int tens[] = {10,20,30,40,50};
        for(int i = 0; i < tens.length;i++){
            System.out.println(tens[i]);
        }
    }
    
}
