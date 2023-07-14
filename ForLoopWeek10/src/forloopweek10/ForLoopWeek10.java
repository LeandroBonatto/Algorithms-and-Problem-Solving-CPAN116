/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopweek10;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class ForLoopWeek10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Display hello world 5 times
        //initialization; test; test
        int count;
        for(count = 1; count <= 5; count++){ // count + 1
            //1 < 5 - true 1st iteration , count = 2
            //2 < 5 - true 2st iteration , count= 3.....
            System.out.println("Hello World");
        }
       
        //2. use count variable in the for loop
        for(int counter = 0; counter < 10; counter++ ) {
            System.out.println("counter is: " + (counter * 2));
        }
        
        //3. specify a different step amount other than 1
        //display odd numbers between 1 and 20
        int endValue = 20;
        for(int i = 1; i <= endValue; i = i + 2) {
            // 1 < 20, true, i = 3
            // 3 < 20, true, i = 5...
            System.out.println("Odd number: " + i);
        }
        
        //4. Decrementing for loop
        for(int i = 10; i > 0; i--) {  //i - 1
            System.out.println("i: " + i);
        }
        
        // 10, 20, 30, 40
        // step1 = 10 + 20 = 30
        // step2 = 30 + 30 = 60
        //step3 = 60 + 40 = 100
        //5. Ask user for the number of iterations
        System.out.println("How many sales do you have?");
        Scanner scan = new Scanner(System.in);
        int numOfSales = scan.nextInt();
        System.out.println("Enter sales: ");
        double sales, totalOfSales = 0;
        for(int i = 0; i < numOfSales; i++) {
            sales = scan.nextDouble();
            totalOfSales = totalOfSales + sales; // totalOfSales += sales;
            System.out.println("Running total: " + totalOfSales);
        }
        System.out.println("Total of sales: " + totalOfSales);
        
    }
}