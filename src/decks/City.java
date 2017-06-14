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
    private float Longitude; //Parameters to pass to the api call
    private float Latitude; //Parameters to pass to the api call
    private float Radio; //Parameters to pass to the api call

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

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }
    
    
    
}
