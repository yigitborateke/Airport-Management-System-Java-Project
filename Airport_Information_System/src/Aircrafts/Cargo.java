/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aircrafts;
/**
 *
 * @author Yiğit Bora Teke - Ali Yağız Mumcu
 */
public class Cargo {
    private String contains,sentDate,cargoId;

    public Cargo() {
    }

    public Cargo(String cargoId, String contains, String sentDate) {
        this.cargoId = cargoId;
        this.contains = contains;
        this.sentDate = sentDate;
    }

    @Override
    public String toString() {
        return "\ncargoId="+cargoId+"\nContains="+contains+"sentDate="+sentDate; //To change body of generated methods, choose Tools | Templates.
    }
    
}
