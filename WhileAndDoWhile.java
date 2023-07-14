 
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
public class WhileAndDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sales, totalSales;
        totalSales = 0;

        //A string variable to use in while loop
        String confirm = "yes";
        /*
        If the condition is true, the statements inside the body of while are executed and
        the loop starts over. 
        If the condition is false, the statements are skipped and loop exits.
         */
    /*  while(confirm.equals("yes")){
            System.out.println("Enter sales");
            sales = scan.nextDouble();
            totalSales += sales;
            System.out.println("More sales?");
            confirm = scan.next();
        }
        System.out.println("Total Sales: $" + totalSales);*/

        //Note: The string variable is not initialized to yes
        String moreSales = "";
        //do-while: The statement inside the loop body are always performed once, and then repeated while the condition is true.
        do {
            System.out.println("Enter sales");
            sales = scan.nextDouble();
            totalSales += sales;
            System.out.println("More sales?");
            moreSales = scan.next();
        } while (moreSales.equals("yes"));
        System.out.println("Total Sales: $" + totalSales);
    }

}
