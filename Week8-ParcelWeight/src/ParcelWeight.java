
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
public class ParcelWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parcel weight in kg");
        //call a method of scanner class to get a double from keyboard
        double parcelWeight = scan.nextDouble();
        double cost = 0; //holds final cost
        /* Parcel weight        Cost per kg
           < 2.5 kg             $3.50 per kg
           2.5 - 5 kg           $2.85 per kg
           > 5 kg               $2.45 per kg
        */
        if(parcelWeight > 0 && parcelWeight < 2.5){
            cost = 3.50 * parcelWeight;
        }else if(parcelWeight >= 2.5 && parcelWeight <= 5){
            cost = 2.85 * parcelWeight;
        }else if(parcelWeight > 5){
            cost = 2.45 * parcelWeight;
        }
        //display result
        System.out.println("Pay " + String.format("$%.2f", cost) + " to deliver a parcel weighing " + parcelWeight + "kg");
    }
    
}
