
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
public class Fraction {
    //fields/attributes
    private double numerator;
    private double denominator;
        
    //constructor has the same name as the class
    //define the constructor to change the values of attributes
    //constructor has no return type
    public Fraction(double newNum, double newDen){
        numerator = newNum;
        denominator = newDen;
    }
    
    public Fraction(){
        
    }
    
    //setters, set methods, mutators
    //every method must have a return type - void or non-void
    public void setNumerator(double newNum){
        numerator = newNum;
    }
    
    public void setDenominator(double newDen){
        denominator = newDen;
    }
    
    public void inputDenominator(Scanner scan){
        System.out.println("Please enter denominator");
        double num = scan.nextDouble();
        if(num != 0)
            setDenominator(num);
        else{
            System.out.println("Denominator cannot be 0");
            System.out.println("Please enter denominator");
            setDenominator(scan.nextDouble());
        }
    }
    
    public void inputNumerator(Scanner scan){
        System.out.println("Please enter numerator");
        double num = scan.nextDouble();
        setNumerator(num);
    }
    
    //get method, getters, accessors
    //return the value of private field - nonvoid
    public double getNumerator(){
        return numerator;
    }
    
    public double getDenominator(){
        return denominator;
    }
    
    public double convertToDecimal(){
      /* double decimal = numerator / denominator;
        return decimal;*/
        return numerator / denominator;
    }
    
    public double addToFraction(int numToAdd){
        double answer = convertToDecimal() + numToAdd;
        return answer;
    }
}

