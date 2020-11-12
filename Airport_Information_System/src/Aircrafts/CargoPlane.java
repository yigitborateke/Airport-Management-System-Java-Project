package Aircrafts;
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
public class CargoPlane extends Aircraft implements Interface{
  
    private Cargo cargo;
    private double WeightCapacity;
    private String Usage;

    public CargoPlane(String airport,String WeightCapacity, String Usage, String model, String from, String toWhere, String pilotName, String coPilot, String STATUS, String modelyear, String flightDistance,Cargo temp) {
        super(airport, model, from, toWhere, pilotName, coPilot, STATUS, Integer.parseInt(modelyear), Integer.parseInt(flightDistance));
        this.WeightCapacity = Double.parseDouble(WeightCapacity);
        this.Usage = Usage;
        this.cargo = temp;
    }

    
    
    @Override
    public String toString() {
        return super.toString()+"\nWeightCapacity"+WeightCapacity+"\nUsage="+Usage+"\nCargo="+cargo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String FlightID_Generator() {
        String res;
        res="CRG"+numOfPlanes+1001;//to show realistic numbers we add big number such as 101 to number of planes count
        return res;
    }
    
    
    
}
