/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class IdealBodyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Java is case sensitive but pseudocode is not
        Integer and integer means same in pseudocode
        but Int and int are not same.
        */
        // Step 1: Input
        //1. Declare variables
        // Declare Integer feet, inches
        int feet,inches;
        //2. Get inputs
        //Input feet
        //Input inches
        /*We will skip taking inputs in Java this week
          as it might be overwhelming, do it later.
          For now, we will initialize our variables.
          3. Set feet = 6
          4. Set inches = 2
        */
        feet = 5;
        inches = 11;
        //Step 2: Processing - calculate ideal body weight
        //5. Declare Integer pounds
        // Set pounds = 110
        double pounds = 110.567;
        //6. Set feet = feet - 5 
        feet = feet - 5;
        //7. Set inches += feet * 12
        //Convert feet into inches and add them to existing inches variable
        inches = inches + (feet * 12);
        //8. Set pounds += inches * 5
        pounds = pounds + (inches * 5);
        //Step 3: Results
        //Display "Ideal body weight is " , pounds, " pounds"
        //We use , in pseudocode for concatenation
        //though in Java, to concatenate a string with a number use +
        System.out.println("Ideal body weight is " + pounds + " pounds");
    }
    
}
