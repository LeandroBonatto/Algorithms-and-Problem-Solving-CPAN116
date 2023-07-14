
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class SelectionsStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input for parcel weight
        Scanner input = new Scanner(System.in);
        double parcelWeight;
        System.out.println("Enter weight in kg");
        parcelWeight = input.nextDouble();
        double cost = 0;
        // And && - OR ||
        if(parcelWeight > 0 && parcelWeight < 2.5){
            cost = parcelWeight * 3.5; // <2.5 kg $3.50 per kg
        } else if(parcelWeight >= 2.5 && parcelWeight <= 5) {
            cost = parcelWeight * 2.5; // <2.5 - 5 kg $2.85 per kg
        } else if(parcelWeight > 5) {
            cost = parcelWeight * 2.45;  // >5 kg $2.45 per kg
        }
        
        
        System.out.println("Pay " + String.format("$%.2f",cost) + " for the parcel weighing: " + parcelWeight + " Kg(s)");
    }
    
}
