
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class TimeAssignment {    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int countTime;
        System.out.println("Enter the number of seconds");
        countTime = input.nextInt();
        
        time.setNumOfHours();
        time.setNumOfMinutes();
        time.setNumOfSeconds();
        
        System.out.println("You have entered" + countTime + "seconds which is equivalent to" + time.getNumOfHours + "hours," + time.getNumOfMinutes + "minutes," + time.getNumOfSeconds + "seconds");
    }
    
}
