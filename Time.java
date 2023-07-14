
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
public class Time {
    private int numOfHours;
    private int numOfMinutes;
    private int numOfSeconds;
    
    public Time(){
        numOfHours = 0;
        numOfMinutes = 0;
        numOfSeconds = 0;
    
    }
    
    public void convert(int totalSeconds){
    numOfHours = (totalSeconds / 3600);
    numOfMinutes = (numOfHours - 2) * 60;
    numOfSeconds = numOfMinutes / 60;
    // " " are reserved only for Strings, numbers / mathematical formulas are not surrounded by  " "
    }
    
    //as we are calculating number of hours, minutes and seconds, so there is no point of setting them in the constructor.
    //Likewise, we cannot make setters to set their values. convert() methpd will calculates the numbers.
   /* public TimeAssignment(int hours, int minutes, int seconds) {
        numOfHours = hours;
        numOfMinutes = minutes;
        numOfSeconds = seconds;
    }*/
    
    public int getNumOfHours(){
        return numOfHours;
    }

    public int getNumOfMinutes(){
        return numOfMinutes;
    }

    public int getNumOfSeconds(){
        return numOfSeconds;
    }

    /* Though I fixed them, but do not use them for this program as they have no purpose here
     * the value to copy in the field must be passed in the parameter.
    
    public void setNumOfHours(int hours){
        numOfHours = hours;
    }
    
    public void setNumOfMinutes(int minutes){  
        numOfMinutes = minutes;
    }

    public void setNumOfSeconds(int seconds){
        numOfSeconds = seconds;
    }
*/

    void convert(Time totalSeconds) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
