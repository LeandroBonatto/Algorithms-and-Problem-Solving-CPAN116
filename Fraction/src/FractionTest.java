
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
public class FractionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object of Fraction class
        Fraction fraction;  //reference variable
        fraction = new Fraction();
        Scanner scan = new Scanner(System.in);
        
        /* Fraction fraction1 = new Fraction();
        
         //calling set method
        fraction.setNumerator(5);  //5 is an argument
        fraction.setDenominator(10);*/
       
       //change denominator to 10
        fraction.inputNumerator(scan);
        fraction.inputDenominator(scan);
        
        //get our fields values
        System.out.println("Your numerator is: " +fraction.getNumerator());
        System.out.println("Your denominator is: " + fraction.getDenominator());
        double decimal = fraction.convertToDecimal();
        System.out.println("The decimal version of fraction is: " + decimal +
                "\nEnter a number to add to the fraction");
        int numToAdd = scan.nextInt();
        System.out.println("After adding " + numToAdd + " to my fraction: " +
                 fraction.addToFraction(numToAdd));
       
    }
}
