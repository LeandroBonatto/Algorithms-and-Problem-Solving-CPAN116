/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3.beersong;

/**
 *
 * @author LEANDRINHO
 */
public class Assignment3BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int bottle = 100; bottle > 0; bottle--) {
            if(bottle>=2){
                System.out.println(bottle + " bottles of beer on the wall," +
                "\n" + bottle + " bottles of beer." + 
                "\nTake one down, pass it around," +
                "\n" + (bottle - 1) + " bottles of beer on the wall.\n");
            }else{
                System.out.println(bottle + " bottles of beer on the wall," +
                "\n" + bottle + " bottles of beer." + 
                "\nTake one down, pass it around," +
                "\n" + (bottle - 1) + " No more bottles of beer on the wall.\n");
            }
        }
    }
}
