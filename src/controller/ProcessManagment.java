/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import internalLogic.ArcGraph;
import internalLogic.GraphNode;
import java.util.*;

/**
 *
 * @author albertoobando
 */
public class ProcessManagment {
    
    private ArrayList<ArcGraph> Arcs = new ArrayList<>();
    private ArrayList<GraphNode> Nodes = new ArrayList<>();
    
    /**
     * Function to get the distance between two geographical locations
     * @param pLat1 Latitude #1
     * @param pLon1 Longitude #1
     * @param pLat2 Latitude #2
     * @param pLon2 Longitude #2
     * @return The distance between the two points
     */
    public double getDistance(double pLat1, double pLon1, double pLat2, double pLon2){
        double result = 0.0;
        
        //double radioTierra = 3958.75;//en millas  
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(pLat2 - pLat1);  
        double dLng = Math.toRadians(pLon2 - pLon1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(pLat1)) * Math.cos(Math.toRadians(pLat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        result = radioTierra * va2; 
        result = result / 1000; //we divide by 1000 to get the result in meters.
   
        return result;
    }
    
    /**
     * Function to set all the arcs of the graph
     * the arcs depend on the latitude and longitude of one another
     * we take one node and compare the distance between it and all the other nodes
     * if the distance is in the correct range (<=50 mts) we create the arc
     */
    public void setArcs(){
        
        //First for to get one node and compare it to all the others
        for (int i = 0; i < Nodes.size(); i++){
            GraphNode node_source = Nodes.get(i);
            double lat1 = node_source.getLatitude();
            double lon1 = node_source.getLongitude();
            
            //Second for to get another node and compare it to first node
            for (int x = 0; i < Nodes.size(); x++){
                GraphNode node_destiny = Nodes.get(x);
                double lat2 = node_destiny.getLatitude();
                double lon2 = node_destiny.getLongitude();
                
                //We begin the process to se if the arc can be created
                double distance = getDistance(lat1, lon1, lat2, lon2);
                if (distance <= 50.0){ //If it is in the roght range create the arc
                    ArcGraph temp_arc = new ArcGraph(distance, node_source, node_destiny);
                    node_source.getConections().add(temp_arc); //we add the arc reference to the node_source
                    Arcs.add(temp_arc); //we add the arc to the arc list of the graph
                }
            }
        }
    }
    
    /**
     * Function to delete all nodes that only have a connection to themselves
     */
    public void deleteNodes(){
        
        ArrayList<Integer> pos_list = new ArrayList<>();
        
        //For to go trough all the nodes
        for (int i = 0; i < Nodes.size(); i++){
            if (Nodes.get(i).getConections().size() == 1){
                pos_list.add(i); //adds the position to be deleted
            }
        }
        
        int pos_corrector = 0;
        //For to delete all the nodes
        for (int x = 0; x < pos_list.size(); x++){
            Nodes.remove(pos_list.get(x) - pos_corrector);
            pos_corrector++; //we adjust the pos_corrector
        }
        
    }
    
    
    
    
}
