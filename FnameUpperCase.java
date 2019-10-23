/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnameuppercase;

/**
 *
 * @author chris
 */
public class FnameUpperCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String uppercase = fullnameU("Chris","Markoulis");
        System.out.println(uppercase);
        
    }
    
    
    public static String fullnameU(String fname,String lname){
        String fullname = fname + " " + lname;
        String uppercase = fullname.toUpperCase();
        return uppercase;
        
    }
    
 
    
}
