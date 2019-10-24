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
public class Book {
    
    private String name;
    private double prize;
    private int qty;
    private Author author;
    
    public String getName(){
    
        return name;
       }
    public void setName(String name){
    
    this.name = name;
    }
    
    public double getPrize(){
    
    return prize;
    }    
    
    public void setPrize(){
    
    this.prize = prize;
    }
    
    public int getQty(){
    
    return qty;
    }
    
    public void setQty(int qty){
    
    this.qty = qty;
    }
    
    public Author getAuthor(){
    
    return author;
    }
    
    public void setAuthor(Author author){
    
    this.author = author;
    
    }
    
    public String toString(){
    
    String bookInfo = "Book" + "name" + name + ",prize=" + prize + ",qty=" + qty + ", author=" + author;
    return bookInfo;
    }
    
    
    
    
    
    
    
    
    
    
}
