/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class Time {
    
    private int numOfHours;
    private int numOfMinutes;
    private int numOfSeconds;
    
    public TimeAssignment(){
 
    numOfHours = "(countTime / 3600)";
    numOfMinutes = "(numOfHours - 2) * 60";
    numOfSeconds = "numOfMninutes / 60";
    }
    
    public TimeAssignment(int hours, int minutes, int seconds) {
        numOfHours = hours;
        numOfMinutes = minutes;
        numOfSeconds = seconds;
    }
    
    public int getNumOfHours(){
        return numOfHours;
    }

    public int getNumOfMinutes(){
        return numOfMinutes;
    }

    public int getNumOfSeconds(){
        return numOfSeconds;
    }

    public void SetNumOfHours{
        numOfHours = hours;
    }
    
    public void setNumOfMinutes{
        numOfMinutes = minutes;
    }

    public void setNumOfSeconds{
        numOfSeconds = seconds;
    }
}

