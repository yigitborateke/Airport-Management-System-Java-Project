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
public abstract class Aircraft {

    protected String airport,flightID, model, from, toWhere, pilotName, coPilot, STATUS;
    protected int modelyear;
    protected double flightDistance;
    protected static int landingCount;
    protected static int numOfPlanes=0;

    public Aircraft() {
        numOfPlanes++;
    }

    public Aircraft(String airport,String model, String from, String toWhere, String pilotName, String coPilot, String STATUS, int modelyear, double flightDistance) {
        this.airport=airport;
        this.model = model;
        this.from = from;
        this.toWhere = toWhere;
        this.pilotName = pilotName;
        this.coPilot = coPilot;
        this.STATUS = STATUS;
        this.modelyear = modelyear;
        this.flightDistance = flightDistance;
        numOfPlanes++;
    }

    public String getCoPilot() {
        return coPilot;
    }

    public String getAirport() {
        return airport;
    }

    public double getFlightDistance() {
        return flightDistance;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getFrom() {
        return from;
    }

    public static int getLandingCount() {
        return landingCount;
    }

    public String getModel() {
        return model;
    }

    public int getModelyear() {
        return modelyear;
    }

    public String getPilotName() {
        return pilotName;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public String getToWhere() {
        return toWhere;
    }

    public void setCoPilot(String coPilot) {
        this.coPilot = coPilot;
    }

    public void setFlightDistance(double flightDistance) {
        this.flightDistance = flightDistance;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "flightID=" + flightID + ", model=" + model + ", from=" + from + ", toWhere=" + toWhere + ", pilotName=" + pilotName + ", coPilot=" + coPilot + ", STATUS=" + STATUS + ", modelyear=" + modelyear + ", flightDistance=" + flightDistance + '}';
    }
    
    

}
