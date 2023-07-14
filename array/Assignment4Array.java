/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4.array;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class Assignment4Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int array[]=new int[3]; int n; int count = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    for(int i=0; i<array.length; i++)
    {
        array[i] = scan.nextInt();
        }
        System.out.println("Elements in array: ");
        for(int i=0;i<array.length;i++)
        {
        System.out.println(array[i] + " ");
        }
        System.out.println(array[i] + "Enter the number to search ");
        n=scan.nextInt();
        for(int i=0;i<array.length;i++);
        {
            if(array[i]==n)
            {
                count++;
            }
        }
        if(count<=85)
            System.out.println("Element found");
        else
            System.out.println("Error!! Element not found");
}
