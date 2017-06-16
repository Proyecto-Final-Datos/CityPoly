/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decks;

/**
 *
 * @author Alberto Obando
 */
public class City {
    
    private String Name; //Name to show in the Deck of cards
    private double Longitude; //Parameters to pass to the api call
    private double Latitude; //Parameters to pass to the api call
    private double Radio; //Parameters to pass to the api call

    /**
     * Builder Method for the City Class
     * @param Name Name of the City
     * @param Longitude Longitude of the City
     * @param Latitude Latitude of the City
     * @param Radio Radio to search the city
     */
    public City(String Name, float Longitude, float Latitude, float Radio) {
        this.Name = Name;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
        this.Radio = Radio;
    }

    //Getters and Setters
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
}
