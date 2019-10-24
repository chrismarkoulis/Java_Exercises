/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinfo;

/**
 *
 * @author chris
 */
public class CircleEx {
    private double radius = 1.0;
    private String colour = "red";
    
    
    public double getRadius() {             
        
        return radius;

    }
    
    public double getArea() {
        double area = Math.PI + Math.pow(radius, 2); 
        return area;

    }
    
    public String toString(){
        String CircleInfo = "Circle's radius is:" + radius + "Circle's colour is: " + colour;
                        
      return CircleInfo;  
    }
}
