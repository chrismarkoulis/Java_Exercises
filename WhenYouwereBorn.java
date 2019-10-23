/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whenyouwereborn;

/**
 *
 * @author chris
 */
public class WhenYouwereBorn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int myAge = 30;
        int currentYear = 2019;
        int dateOfBirth = currentYear - myAge;
        int futureDate = 2040 - dateOfBirth;
        int pastDate;

        if (dateOfBirth < 1960) {
            pastDate = 1960 - dateOfBirth;

        } else {
            pastDate = 0;
        }

        System.out.println("You were born in " + dateOfBirth);
        System.out.println("In 2040 you will be " + futureDate + " years old");
        System.out.println("In 1960 you were " + pastDate + " years old");



    }
    
}
