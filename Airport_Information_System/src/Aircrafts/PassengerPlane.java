package Aircrafts;
import Aircrafts.Passenger;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yiğit Bora Teke - Ali Yağız Mumcu
 */
public class PassengerPlane extends Aircraft implements Interface {
    
    private String companyName;
    private int numOfCabinAttendant;
    private ArrayList<Passenger> passengers = new ArrayList();

    public PassengerPlane(String  numOfCabinAttendant, String companyName,String airport, String model, String from, String toWhere, String pilotName, String coPilot, String STATUS, String modelyear, String flightDistance) {
        super(airport,model, from, toWhere, pilotName, coPilot, STATUS, Integer.parseInt(modelyear), Double.parseDouble(flightDistance));
        this.companyName=companyName;
        this.numOfCabinAttendant = Integer.parseInt(numOfCabinAttendant);
        
    }

    @Override
    public String toString() {
        return super.toString()+"PassengerPlane{" + "companyName=" + companyName + ", numOfCabinAttendant=" + numOfCabinAttendant + ", passengers=" + passengers + '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getNumOfCabinAttendant() {
        return numOfCabinAttendant;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    

    @Override
    public String FlightID_Generator() {
        String res="";
        switch(companyName){
            case "Turkish Airlines":
                res+="TK"; 
                break;
           case "AnadoluJet":
               res+="AJ";
               break;
           case "Pegasus":
               res+="PGS";
               break;
            
        }
        res+=""+numOfPlanes+591;//to show realistic numbers we add big number such as 591 to number of planes count
        return res;
        
    }
    
    
    
    
    
}
