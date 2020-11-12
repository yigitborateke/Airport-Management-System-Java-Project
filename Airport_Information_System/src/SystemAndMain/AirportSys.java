/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import Aircrafts.Aircraft;
import Aircrafts.Cargo;
import Aircrafts.CargoPlane;
import Aircrafts.Passenger;
import Aircrafts.PassengerPlane;
import Aircrafts.PrivatePlane;
import Airport.Airport;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yiğit Bora Teke - Ali Yağız Mumcu
 */
public class AirportSys {
    //TODO change all of this to hashMap structure!!!
    private static HashSet<Airport> Airports = new HashSet<>();
    private static ArrayList<Aircraft> aircrafts = new ArrayList<>();
    
    //since the flight ids are uniquie there is no need to check the id while adding to the array
    //adding a passenger plane
    public static void landPassenger(String numOfCabinAttendent,String companyName,String airport,String model, String from, String toWhere, String pilotName, String coPilot, String status, String modelYear, String flightDistance,  ArrayList<Passenger> arr) {
        PassengerPlane newPP = new PassengerPlane(numOfCabinAttendent, companyName,airport, model, from, toWhere, pilotName, coPilot, status, modelYear, flightDistance);
        newPP.setFlightID(newPP.FlightID_Generator());
        aircrafts.add(newPP);
    }
    //adding a cargo plane
    public static void landCargo(String airport,String weightCapacity, String usage, Cargo c, String model, String from, String toWhere, String pilotName, String coPilot, String status, String modelYear, String flightDistance) {
        CargoPlane newCP = new CargoPlane(airport,weightCapacity, usage, model, from, toWhere, pilotName, coPilot, status, modelYear, flightDistance, c);
        newCP.setFlightID(newCP.FlightID_Generator());
        aircrafts.add(newCP);
    }
    //adding a private plane
    public static void landPrivate(String airport, String ownerName, String ownerSurname, String model, String from, String toWhere, String pilotName, String coPilot, String STATUS, String modelyear, String flightDistance) {
        PrivatePlane newPriPlane = new PrivatePlane( airport,ownerName, ownerSurname, model, from, toWhere, pilotName, coPilot, STATUS, modelyear, flightDistance);
        newPriPlane.setFlightID(newPriPlane.FlightID_Generator());
        aircrafts.add(newPriPlane);
    }
    //removing a plane from a airport
    public static boolean getOff(String flight_ID) {
        for (Aircraft x : aircrafts) {
            if (x.getFlightID().equals(flight_ID)) {
                aircrafts.remove(x);
                return true;
            }
        }
        return false;
    }

    public static boolean toRepair(String flight_ID) {
        for (Aircraft x : aircrafts) {
            if (x.getFlightID().equals(flight_ID)) {
                x.setSTATUS("In Repair");
                return true;
            }
        }
        return false;
    }

    public static String display(String airport) {
        String res = "";
        for (Aircraft x : aircrafts) {
            if(x.getAirport().equals(airport))
                res += x.toString();
        }
        return res;
    }

    public static String searchPlane(String flight_ID) {
        for (Aircraft x : aircrafts) {
            if (x.getFlightID().equals(flight_ID)) {
                return x.toString();
            }
        }
        return null;
    }
    //getting all the id to a string array in order to show in combobox
    public static String[] getFlight_IDs(String airport) {
        String[] arr = new String[aircrafts.size()];
        int i = 0;
        int arr2Size=0;
        for (Aircraft x : aircrafts) {
            if(x.getAirport().equals(airport))
            {
                arr[i] = x.getFlightID();
                arr2Size++;
                
            }
            else{
                arr[i]="";
            }
            i++;
        }
       // in AirportScreen the combobox was gettin null items too and it was looking bad therefore we solve the problem by getting array size correctly by implementing arr2
        String[] arr2=new String[arr2Size];
        int y=0;
        for(int x=0;x<aircrafts.size();x++){
            if(!arr[x].equals("")){
                arr2[y]=arr[x];
                y++;
            }
        }
        return arr2;
    }
    
    public static void readAirports(){
        try {
            File file=new File("airports.txt");
            Scanner inp=new Scanner(file);
            while(inp.hasNext()){
                String name=inp.next();
                String city=inp.next();
                String crgCapacity=inp.next();
                String priCapacity=inp.next();
                String passCapatcity=inp.next();
                String repairCapacity=inp.next();
                Airport a=new Airport(name,city,Integer.parseInt(crgCapacity),Integer.parseInt(priCapacity),Integer.parseInt(passCapatcity),Integer.parseInt(repairCapacity));
                Airports.add(a);
            }
            inp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AirportSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readPlanes(){
        try {
            File file=new File("aircrafts.txt");
            Scanner inp=new Scanner(file);
            while(inp.hasNext()){
                String airport=inp.next();
                String type=inp.next();
                String flight_ID=inp.next();                
                String model=inp.next();
                String from=inp.next();
                String toWhere=inp.next();
                String pilot=inp.next();
                String coPilot=inp.next();
                String status=inp.next();
                String modelYear=inp.next();
                String flightDistance=inp.next();
                switch(type){
                    case "passenger": 
                        String company=inp.next();
                        String attendNumber=inp.next();
                        PassengerPlane passPlane=new PassengerPlane(attendNumber,company,airport,model,from,toWhere,pilot,coPilot,status,modelYear,flightDistance);
                        passPlane.setFlightID(flight_ID);
                        String fileName=passPlane.getFlightID()+".txt";
                        try{
                            File file1=new File(fileName);
                            Scanner pinp=new Scanner(file1);
                            while(pinp.hasNext()){
                                String name=pinp.next();
                                String surname=pinp.next();
                                Passenger p=new Passenger(name,surname);
                                passPlane.getPassengers().add(p);
                            
                        }
                            pinp.close();
                        }catch (FileNotFoundException ex) {
                            Logger.getLogger(AirportSys.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                        aircrafts.add(passPlane);
                        break;
                        
                    case "private":
                        String oName=inp.next();
                        String oSurname=inp.next();
                        PrivatePlane priPlane=new PrivatePlane(airport,oName,oSurname,model,from,toWhere,pilot,coPilot,status,modelYear,flightDistance);
                        priPlane.setFlightID(flight_ID);
                        aircrafts.add(priPlane);
                        break;
                    case "cargo":
                        String weight=inp.next();
                        String usage=inp.next();
                        String cId=inp.next();
                        String contains=inp.next();
                        String sentDate=inp.next();
                        Cargo c=new Cargo(cId,contains,sentDate);
                        CargoPlane cargoP=new CargoPlane(airport,weight, usage, model, from, toWhere,pilot, coPilot, status, modelYear, flightDistance, c);
                        cargoP.setFlightID(flight_ID);
                        aircrafts.add(cargoP);
                        break;
                }
            }
            inp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AirportSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String[] getAirportNames(){
        String[] arr=new String[Airports.size()];
        int i=0;
        for(Airport x:Airports){
            arr[i]=x.getAirportName();
            i++;
        }
        return arr;
    }
    //testing all the reading for airports is done perfectly
    
//    public static String x(){
//        String res="";
//        for(Airport x:Airports){
//            res+=x.toString();
//        }
//        
//        return res;
//        
//    }
}
