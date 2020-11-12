/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airport;

/**
 *
 * @author User
 */
public class Airport {
    private String AirportName,city;
    private int CargoParkCapacity,PrivateParkCapacity,PassengerParkCapacity;
    private int repairHangarCapacity;

    public Airport(String AirportName, String city, int CargoParkCapacity, int PrivateParkCapacity, int PassengerParkCapacity, int repairHangarCapacity) {
        this.AirportName = AirportName;
        this.city = city;
        this.CargoParkCapacity = CargoParkCapacity;
        this.PrivateParkCapacity = PrivateParkCapacity;
        this.PassengerParkCapacity = PassengerParkCapacity;
        this.repairHangarCapacity = repairHangarCapacity;
    }

    public String getAirportName() {
        return AirportName;
    }

    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCargoParkCapacity() {
        return CargoParkCapacity;
    }

    public void setCargoParkCapacity(int CargoParkCapacity) {
        this.CargoParkCapacity = CargoParkCapacity;
    }

    public int getPrivateParkCapacity() {
        return PrivateParkCapacity;
    }

    public void setPrivateParkCapacity(int PrivateParkCapacity) {
        this.PrivateParkCapacity = PrivateParkCapacity;
    }

    public int getPassengerParkCapacity() {
        return PassengerParkCapacity;
    }

    public void setPassengerParkCapacity(int PassengerParkCapacity) {
        this.PassengerParkCapacity = PassengerParkCapacity;
    }

    public int getRepairHangarCapacity() {
        return repairHangarCapacity;
    }

    public void setRepairHangarCapacity(int repairHangarCapacity) {
        this.repairHangarCapacity = repairHangarCapacity;
    }
    
    public boolean CapacityChecker(String type){
        switch(type){
            case "Passenger Plane":
                if(PassengerParkCapacity==0)
                    return false;
                break;
            case "Cargo Plane":
                if(CargoParkCapacity==0)
                    return false;
                break;
            case "Private Plane":
                if(PrivateParkCapacity==0)
                    return false;
                break;
               
        }
        return true;
    }
    
    public boolean RepairCapacityChecker(){
        if(repairHangarCapacity==0)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\n\nAirport{" + "AirportName=" + AirportName + ", city=" + city + ", CargoParkCapacity=" + CargoParkCapacity + ", PrivateParkCapacity=" + PrivateParkCapacity + ", PassengerParkCapacity=" + PassengerParkCapacity + ", repairHangarCapacity=" + repairHangarCapacity + '}';
    }
    
    
    
}
