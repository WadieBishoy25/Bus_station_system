/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

/**
 *
 * @author wadiebishoy
 */
public abstract class Vehicle {
    
    protected int noOfSeats ;
    protected double priceFactor ;
    private String Driver ;

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }
   
}
