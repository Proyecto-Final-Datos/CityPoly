/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import decks.TypePlace;
import java.util.*;

/**
 *
 * @author Alberto Obando
 */
public class GraphNode {
    
    private String Place; //Name of the Place to visit
    private String Thumbnail; //Tiene que ser el thumbnail del lugar -> URL
    private TypePlace Type; //Type of place to visit -> to know if its valid for 
    private double Rating; //Used to sum up stars in the game
    private double Latitude; //Latitude of the place -> to calculate adyacent Nodes
    private double Longitude; //Longitude of the place -> to calculate adyacent Nodes
    
    private ArrayList<Arc> Conections = new ArrayList<Arc>(); //List of Connections to other Nodes

    /**
     * Builder Method for the GraphNode Class
     * @param Place
     * @param Thumbnail
     * @param Type
     * @param Rating
     * @param Latitude
     * @param Longitude 
     */
    public GraphNode(String Place, String Thumbnail, TypePlace Type, double Rating, double Latitude, double Longitude) {
        this.Place = Place;
        this.Thumbnail = Thumbnail;
        this.Type = Type;
        this.Rating = Rating;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
    }
    
    public GraphNode(String Place, String Thumbnail){
        this.Place = Place;
        this.Thumbnail = Thumbnail;
    }
    
    public GraphNode(String Place, double Latitude, double Longitude){
        this.Place = Place;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
    }
    
    //Getters and Setters

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    public TypePlace getType() {
        return Type;
    }

    public void setType(TypePlace Type) {
        this.Type = Type;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public ArrayList<Arc> getConections() {
        return Conections;
    }

    public void setConections(ArrayList<Arc> Conections) {
        this.Conections = Conections;
    }
    
    @Override
    public String toString() {
        return Place;
    }
    
}
