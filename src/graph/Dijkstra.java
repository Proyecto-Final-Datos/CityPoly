/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Alberto Obando
 */
public class Dijkstra {
    
    private ArrayList<GraphNode> ultimo;
    private ArrayList<GraphNode> Nodes; //The list of nodes in the graph
    private ArrayList<Boolean> MinDistanceStatus; //This list is used to know if we have the lowest weight for a given Node
    private ArrayList<Double> MinDistance; //This is the list that will contain the minimum distance to get to that node
    private int AmountNodes; //used to create arrays of the right size
    private GraphNode Source; //Node to calculate the minimum distance
    
    public Dijkstra(Graph gp, GraphNode origen){ 
        AmountNodes = gp.getArcs().size(); 
        Source = origen;
        Nodes = gp.getNodes(); //List of Nodes that belong to the graph
        MinDistanceStatus = new ArrayList<Boolean>(AmountNodes);
        MinDistance = new ArrayList<Double>(AmountNodes);
    }
    
    /**
     * Function to get the lowest weight of a node path
     * @param pNode
     * @param pWeight 
     * @return Minimum weight
     */
    public double getMinDistance(GraphNode pNode, double pWeight){
        double result = Double.MAX_VALUE;
        ArrayList<Arc> conections = pNode.getConections();
        
        for (int i = 0; i < conections.size(); i++){
            if (conections.get(i).getWeight() + pWeight < result ){
                result = conections.get(i).getWeight();
            }
        }
        return result;
    }
    
    /**
     * Function to get the node of the lowest weight path
     * @param pNode
     * @param pWeight
     * @return Destiny Node of the lowest weight
     */
    public GraphNode getMinDistanceNode(GraphNode pNode, double pWeight){
        GraphNode result = null;
        double max_double = Double.MAX_VALUE;
        
        ArrayList<Arc> conections = pNode.getConections();
        
        for (int i = 0; i < conections.size(); i++){
            if (conections.get(i).getWeight() + pWeight < max_double ){
                max_double = conections.get(i).getWeight(); //updates the min weight
                result = conections.get(i).getDestiny(); //returns the destiny Node
            }
        }
        return result;
    }
    
    /**
     * Function to get the position of a Node
     * @param pNode
     * @return the position in the list of the node we were searching
     */
    public int findNode(GraphNode pNode){
        int result = 0;
        
        for (int i = 0; i < Nodes.size(); i++){
            if (Nodes.get(i).equals(pNode)){
                result = i;
            }
        }
        
        return result;
    }
    
    /**
     * Function to set all values false
     * Used mainly to start the algorithm
     */
    public void setFalse(){
        for (int i = 0; i < MinDistanceStatus.size(); i++){
            MinDistanceStatus.set(i, false);
        }
    }
    
    /**
     * Function to get the shortest path between two nodes
     * @param pNodeSource
     * @param pNodeDestiny
     * @return 
     */
    public ArrayList<Arc> getPath(GraphNode pNodeSource, GraphNode pNodeDestiny){
        ArrayList<Arc> result = new ArrayList<Arc>();
        
        return result;
    }
    
    
    
    
    
}
