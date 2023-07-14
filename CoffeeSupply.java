
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
public class CoffeeSupply {
    private String typeOfCustomer;
    private int quantity;
    private double price;
    //constants for discount
    private final double PREFERRED = 0.03; 
    private final double NEW = 0.04; 
    private final double STANDARD = 0.0;
    
   public void setQuantity(int newQuantity){
       quantity = newQuantity;
   }
   
   public void setPrice(double newPrice){
       price = newPrice;
   }
    
    public void setTypeOfCustomer(String type){
        Scanner scan = new Scanner(System.in);
        if(!type.equalsIgnoreCase("NEW")&& !type.equalsIgnoreCase("Preferred")&& !type.equalsIgnoreCase("Standard")){
            System.out.println("Not a valid type of customer");
            typeOfCustomer = scan.next();
        }else{
        typeOfCustomer = type;
        }
    }
    
    public double makeAdjustment(){
        double adjustment = 0;
        if(getTypeOfCustomer().equalsIgnoreCase("NEW")){
            adjustment = NEW;
        }
        else if(getTypeOfCustomer().equalsIgnoreCase("Preferred")){
            adjustment = PREFERRED;
        }
        else{
            adjustment = STANDARD;
        }
        return adjustment;
    }
    public double calculateTotal(){
            /*price = (1 - makeAdjustment()) * price;
            double total = price * getQuantity();
                OR
             */ 
            double adjustedPrice = price - (price * makeAdjustment());
            double total = adjustedPrice * getQuantity(); 
            return total;
    }

    /**
     * @return the typeOfCustomer
     */
    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
}
