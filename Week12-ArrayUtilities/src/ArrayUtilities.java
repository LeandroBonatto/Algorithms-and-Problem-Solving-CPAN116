/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class ArrayUtilities {
    // This method accepts an integer array as an argument.
    public int totalOfElements(int myArray[]){
           // Loop counter
           int index;
  	// Accumulator, initialized to 0
           int total = 0;	

   	// Calculate the total of the array elements.
           for(index = 0; index < myArray.length; index++){	
              total = total + myArray[index];
   	}
       return total;
    }

}
