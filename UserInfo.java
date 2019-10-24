/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinfo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class UserInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Scanner info = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = info.nextLine();

        System.out.println("Enter you surname: ");
        String surname = info.nextLine();

        System.out.println("Enter your age: ");
        int age = info.nextInt();

        System.out.println("Enter your favorite colour: ");
        String colour = info.nextLine();

        info.next();
        
        PrintWriter writer = new PrintWriter("MyInfo.txt","UTF-8");
        writer.println(name);
        writer.println(surname);
        writer.println(age);
        writer.println(colour);
        writer.close();

    }

}
