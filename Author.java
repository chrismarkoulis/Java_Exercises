/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4;

/**
 *
 * @author chris
 */
public class Author {

private String name;
private String email;
private char gender;

public String getName(){

return name;
}

public void setName(String name){

this.name = name;
}

public String getEmail(){

return email;
}

public void setEmail(){

this.email = email;
}

public char getGender(){

return gender;    
}

public String toString(){
String authorInfo = "Author" + "name" +  name + ", email" + email + ", gender=" + gender;
return authorInfo;
}






    
    
    
}
