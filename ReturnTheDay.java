/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntheday;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ReturnTheDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int day = in.nextInt();
        
       
        String inputInteger = getDayName(6);
        System.out.println(inputInteger);
    }

    
    public static String getDayName(int day) {
        String NameOfDay = "";
        switch (day) {
            case 1: NameOfDay = "Monday"; 
            break;
            case 2: NameOfDay = "Tuesday"; 
            break;
            case 3: NameOfDay = "Wednesday"; 
            break;
            case 4: NameOfDay = "Thursday"; 
            break;
            case 5: NameOfDay = "Friday"; 
            break;
            case 6: NameOfDay = "Saturday"; 
            break;
            case 7: NameOfDay = "Sunday"; 
            break;
            default:NameOfDay = "Wrong input";
        }

        return NameOfDay;
    }
}
        
