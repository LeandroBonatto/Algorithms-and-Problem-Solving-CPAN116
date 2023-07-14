
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
public class TimeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);  //check the import statement on the top to fix the error here
        
        Time totalSeconds = new Time();
       
        System.out.println("Enter the number of seconds");
         
        //make an object of class
        Time time = new Time();
        time.convert(totalSeconds);
        time.getNumOfHours();
        time.getNumOfMinutes();
        time.getNumOfSeconds();
        
                
        System.out.println("You have entered " + totalSeconds + " seconds which is equivalent to " + time.getNumOfHours() + 
                "hours, " + time.getNumOfMinutes() + " minutes, " + time.getNumOfSeconds() + " seconds");

    }
    
}
