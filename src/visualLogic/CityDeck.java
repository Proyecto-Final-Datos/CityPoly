/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

/**
 *
 * @author Joseph Salas
 */
public class CityDeck{
    
     private String Name; //Name to show in the Deck of cards
    private double Longitude; //Parameters to pass to the api call
    private double Latitude; //Parameters to pass to the api call
    private Long Radio; //Parameters to pass to the api call

    /**
     * Builder Method for the City Class
     * @param Name Name of the City
     * @param Longitude Longitude of the City
     * @param Latitude Latitude of the City
     * @param Radio Radio to search the city
     */
    public  CityDeck(String Name, double Longitude, double Latitude, Long Radio) {
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

    public Long getRadio() {
        return Radio;
    }

    public void setRadio(Long Radio) {
        this.Radio = Radio;
    }
    
}
