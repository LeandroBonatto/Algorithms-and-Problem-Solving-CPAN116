
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
public class CoffeeSupplyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
                
        CoffeeSupply cs = new CoffeeSupply();
        System.out.println("Enter the inputs in the following order:"
                + "\nThe type of customer (New, Preferred or Standard)\nQuantity \nPrice");
        cs.setTypeOfCustomer(scan.next());
        cs.setQuantity(scan.nextInt());
        cs.setPrice(scan.nextDouble());
        System.out.println("A " + cs.getTypeOfCustomer() + " customer has ordered " + cs.getQuantity() + 
                " coffee supplies and pays " + 
                String.format("$%.2f", cs.calculateTotal()));
    }
    
}
