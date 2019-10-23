/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsarrays2;

import java.util.Arrays;

/**
 *
 * @author chris
 */
public class LoopsArrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] integers = {10, 40, 25, 35, 58};
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {

            sum = sum + integers[i];
        }
        System.out.println("the sum of all integers is: " + sum);

        Arrays.sort(integers);
        System.out.println("Min value is " + integers[0]);
        System.out.println("Max value is " + integers[integers.length - 1]);

        double averageValue = sum / (double)integers.length;
        System.out.println("The average value is: " + averageValue);
        
    }
}
