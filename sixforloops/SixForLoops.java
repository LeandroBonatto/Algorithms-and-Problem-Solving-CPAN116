/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sixforloops;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class SixForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //1. Write a loop to print the integers from 0 to 50
        for(int counter = 0; counter < 51; counter++){
        System.out.println(counter);        
        }
    
        
    
    // 2. Ask the user how many times to loop. Start at 1 and loop up to and including the
    // number they enter. Print the counter each time you loop.
        System.out.println("How many loops?");
        int numOfLoops = scan.nextInt();
        int total = 0;
        System.out.println("Enter loops");
        for(int i = 0; i < numOfLoops; i++){
            int loops = scan.nextInt();
            total = total + loops;
        }
        System.out.println("Total Loops: " + total);
    
    
    
    // 3. Write a loop to display the total of the numbers entered. Allow the user to ent five numbers.
        int loopCount;
        System.out.println("Please enter 5 numbers?");
        loopCount = input.nextInt();
        
        for(int i = 0; i < loopCount; i++){
            System.out.println("Total de Loops" + loopCount);
        }
        
    // 4. Write a loop to find the sum of even numbers between 0 to 10. Start at 10 and work backwards to 0.
        int sum = 0;
        for (int i = 10; i <= 0; i--) {
            if (i % 2 == 0){
                sum = sim + i;
            }
        }
        System.out.println("sum");
    }    
}
        
        
   
