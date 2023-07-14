
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
public class PizzaOrder {
    private String size;
    private int numOfToppings;
    private String nameOfTopping;
        
    public PizzaOrder(){

    } 
   
   public double sizeCost(){
       double cost = 0;
        if(size.equalsIgnoreCase("Small")){
            cost = 8.99;
        }else if(size.equalsIgnoreCase("Medium")){
            cost = 11.99;
        }else{
            cost = 13.99;
        }
        return cost;
    }
    
    public double calculateTotalCost(){
        //each topping costs $2
        return getNumOfToppings() * 2 + sizeCost();
    }
        
    public void getPizzaOrder(Scanner scan){
    	System.out.println("Enter size of pizza");
        size = scan.next();
        System.out.println("How many toppings you want?");
        numOfToppings = scan.nextInt();
        System.out.println("Which toppings you want? Cheese is free. \nExtra toppings will cost you $2 each");
        nameOfTopping = "Cheese";
        for(int i = 0; i < numOfToppings; i++){
        nameOfTopping += ", " + scan.next();
        }
    }
    
    public String getSize(){
        return size;
    }
    
    public int getNumOfToppings(){
        return numOfToppings;
    }
    
    public String getNameOfTopping(){
        return nameOfTopping;
    }
}
