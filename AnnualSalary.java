/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annualsalary;

/**
 *
 * @author chris
 */
public class AnnualSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int mSalary = 900;
        int taxes = 81;
        int youEachMonth = mSalary;
        int govEachMonth = taxes;
        int youEachYear = mSalary * 12;
        int govEachYear = taxes * 12;
        System.out.println("Your monthly salary is " + youEachMonth + "$");
        System.out.println("Your annual salary is "  + youEachYear + "$");
        System.out.println("Goverment get " + taxes + "$" + " each month");
        System.out.println("Goverment get " + govEachYear + "$" + " each year");




    }
    
}
