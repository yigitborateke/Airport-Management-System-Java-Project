package Aircrafts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yiğit Bora Teke - Ali Yağız Mumcu
 */
public class Passenger{
    
    private String Firstname, Lastname;

    public Passenger() {
    }

    public Passenger(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname; 
    }

    @Override
    public String toString() {
        return "\n\nPassenger{" + "Firstname=" + Firstname + "Lastname=" + Lastname + '}';
    }
    
    

    
    
    
}
