
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
public class ForLoopTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
         // 1. Bad coding practice.
       /* int sales1, sales2,sales3,sales4,sales5,sales6, totalSales;
        sales1 = scan.nextInt();
        sales2 = scan.nextInt();
        sales3 = scan.nextInt();
        sales4 = scan.nextInt();
        sales5 = scan.nextInt();
        sales6 = scan.nextInt();
        totalSales = sales1 + sales2 + sales3 + sales4 + sales5 + sales6;
         */

        //2. For loop - print Hello World five times
        System.out.println("\n#2");
        int counter, endValue = 5;
        for (counter = 0; counter < endValue; counter++) {
            System.out.println("Hello World");
        }

        //3. Using counter in the body of loop
        System.out.println("\n#3");
        System.out.println("Number \t Square");
        System.out.println("-----------------");

        for (int count = 1; count <= 10; count++) {
            // Calculate number squared.				 
            int square = count * count;
            System.out.println(count + "\t" + square);
        }

        //4. Incrementing by 10
        System.out.println("\n#4");
        for (int i = 0; i <= 100; i = i + 10) {
            System.out.println(i);
        }

        //5. Decrementing for loop
        System.out.println("\n#5");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        
        //6. Let user control number of iterations
        //   Rewrite #1 using for loop
        System.out.println("How many sales do you want to enter?");
        int numOfSales = scan.nextInt();
        int total = 0;
        System.out.println("Enter sales");
        for(int i = 0; i < numOfSales; i++){
            int sales = scan.nextInt();
            total = total + sales;
        }
        System.out.println("Total sales: " + total);
    }
}
