
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
public class PizzaOrderTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PizzaOrder order = new PizzaOrder();
        order.getPizzaOrder(scan);
        System.out.println("You ordered a " + order.getSize()
                + " sized Pizza"+ " with toppings : " + order.getNameOfTopping() + 
                "\nTotal Cost: " + String.format("$%.2f", order.calculateTotalCost()));
    }
    
}
