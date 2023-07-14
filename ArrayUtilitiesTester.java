/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class ArrayUtilitiesTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayUtilities utility = new ArrayUtilities();
    
        // An array initialized with values.
        int numbers[] = {2, 4, 6, 8, 10};

        // Display the total of array elements. 
        System.out.println("Total of array elements:" +
                utility.totalOfElements(numbers)); //passing an array as an argument to the method

    }
    
}
