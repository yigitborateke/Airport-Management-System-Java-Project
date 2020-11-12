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
public class PrivatePlane extends Aircraft implements Interface{
    
    private String  ownerName,ownerSurname;

    public PrivatePlane() {
    }

    public PrivatePlane( String airport,String ownerName,String ownerSurname, String model, String from, String toWhere, String pilotName, String coPilot, String STATUS, String modelyear, String flightDistance) {
        super( airport,model, from, toWhere, pilotName, coPilot, STATUS,Integer.parseInt(modelyear), Integer.parseInt(flightDistance));
        
        this.ownerName = ownerName;
        this.ownerSurname=ownerSurname;
    }

    @Override
    public String FlightID_Generator() {
        String res;
        res=ownerName.substring(0,1)+ownerSurname.substring(0, 1)+100+numOfPlanes;//to show realistic numbers we add big number such as 100 to number of planes count
        return res;
    }

    @Override
    public String toString() {
        return super.toString()+"PrivatePlane{" + "ownerName=" + ownerName + ", ownerSurname=" + ownerSurname + '}';
    }
    
    
    
}
