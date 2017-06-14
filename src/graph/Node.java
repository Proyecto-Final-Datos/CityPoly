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
public class Node {
    
    private String Place; //Name of the Place to visit
    private String Thumbnail; //Tiene que ser el thumbnail del lugar -> URL
    private TypePlace Type; //Type of place to visit -> to know if its valid for 
    
    private List<Node> shortestPath = new LinkedList<>();
     
    private Integer distance = Integer.MAX_VALUE;
     
    Map<Node, Integer> adjacentNodes = new HashMap<>();
 
    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
  
    public Node(String pPlace) {
        this.Place = pPlace;
    }
     
    // getters and setters

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

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
    
    
    
}
