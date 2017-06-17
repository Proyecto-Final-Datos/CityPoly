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
    
    private ArrayList<Arc> References; //List to know from which node the min distance comes from
    private ArrayList<GraphNode> Nodes; //The list of nodes in the graph
    private ArrayList<Boolean> MinDistanceStatus; //This list is used to know if we have the lowest weight for a given Node
    private ArrayList<Double> MinDistance; //This is the list that will contain the minimum distance to get to that node
    private int AmountNodes; //used to create arrays of the right size
    private GraphNode Source; //Node to calculate the minimum distance
    
    public Dijkstra(Graph gp, GraphNode origen){ 
        AmountNodes = gp.getNodes().size(); 
        Source = origen;
        Nodes = gp.getNodes(); //List of Nodes that belong to the graph
        MinDistanceStatus = new ArrayList<>(gp.getNodes().size());
        MinDistance = new ArrayList<>();
        References = new ArrayList<>(AmountNodes);
        this.setMax();  //initializez values
        this.setFalse(); //initializez values
        this.setNull(); //initializes values
    }
    
    //Getters y Setters

    public ArrayList<Arc> getReferences() {
        return References;
    }

    public void setReferences(ArrayList<Arc> References) {
        this.References = References;
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
     * Function to get the Destiny node of the lowest weight path
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
     * Function to get the position of the min non final distance we have until now
     * @return position of the min non final distance
     */
    public int getMinDistanceArray(){
        int result = 0;
        double max_double = Double.MAX_VALUE;
        
        for (int i = 0; i < MinDistance.size(); i++){
            if (!MinDistanceStatus.get(i)){ //only checks for non final weights
                if (MinDistance.get(i) < max_double ){
                    max_double = MinDistance.get(i);
                    result = i;
                }
            }
        }
        
        return result;
    }
    
    /**
     * Function to get the arc of the min distance
     * @param pNode
     * @param pWeight
     * @return arc of the min distance
     */
    public Arc getMinDistanceArc(GraphNode pNode, double pWeight){
        Arc result = null;
        double max_double = Double.MAX_VALUE;
        
        ArrayList<Arc> conections = pNode.getConections();
        
        for (int i = 0; i < conections.size(); i++){
            if (conections.get(i).getWeight() + pWeight < max_double ){
                max_double = conections.get(i).getWeight(); //updates the min weight
                result = conections.get(i);
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
        for (int i = 0; i < Nodes.size(); i++){
            this.MinDistanceStatus.add(false);
        }
    }
    
    /**
     * Sets all the values of the min distance array to its maximum value
     */
    public void setMax(){
        for (int i = 0; i < Nodes.size(); i++){
            this.MinDistance.add(Double.MAX_VALUE);
        }
    }
    
    /**
     * Sets all references to other nodes as null
     */
    public void setNull(){
        for (int i = 0; i < Nodes.size(); i++){
            this.References.add(null);
        }
    }
    
    /**
     * Function to get the shortest path between two nodes
     * @param pNodeSource
     * @param pNodeDestiny
     * @return List of arcs with the shortest path
     */
    public ArrayList<Arc> getPath(GraphNode pNodeSource, GraphNode pNodeDestiny){
        ArrayList<Arc> result = new ArrayList<Arc>();
        
        int pos_destiny = findNode(pNodeDestiny); //Returns the position of the destiny node -> used to get the arc of the shortest path
        GraphNode temp_node = Nodes.get(pos_destiny);
        while (!temp_node.equals(pNodeSource)){ //until the source node equals the one we want to find
            result.add(References.get(pos_destiny)); //adds the arc to the reference list -> result list
            temp_node = References.get(pos_destiny).getSource(); //returns the source of the arc -> so we can find our source node
        }
        
        
        return result;
    }
    
    /**
     * Function to get the shortest path from one node to all the others
     */
    public void execute(){
        
        double default_weight = 0; //This is the weight we change each time we process a new Node
        GraphNode default_node = Source; //we begin with source
        MinDistance.set(findNode(Source), 0.0); //sets the weight of the source node to 0
        MinDistanceStatus.set(findNode(Source), true); //sets the weight as final
        References.set(findNode(Source), new Arc(0.0, Source, Source)); //sets the source of the as himself so no null pointer exception occurs
        
        for (int i = 0; i < Nodes.size(); i++){ //We execute the cicle the number of nodes we have
            
            setWeights(default_node, default_weight); //updates the weight of the weight list
            int min_weight_pos = getMinDistanceArray(); //returns the pos of the min weight
            double min_weight = MinDistance.get(min_weight_pos); //returns the min weight
            //GraphNode min_node = getMinDistanceNode(default_node, default_weight); //returns the destiny node of the min weight
            GraphNode min_node = Nodes.get(min_weight_pos);  //Si no sirve Probar esta linea y no la anterior
            int pos_node = findNode(min_node); //returns the pos of the destiny node
            
            MinDistanceStatus.set(min_weight_pos, true); //sets the weight as final REVISAR
            
            default_weight = min_weight; //Change of values to continue the cicle
            default_node = min_node; //Change of values to continue the 
            
        }
        
    }
    
    /**
     * Function to set the parcial weight of the nodes that aren't final and the Arc to get to it
     * @param pNode
     * @param pWeight 
     */
    public void setWeights(GraphNode pNode, double pWeight){
        ArrayList<Arc> conections = pNode.getConections();
        
        for (int i = 0; i < conections.size(); i++){
            GraphNode destiny_node = conections.get(i).getDestiny();
            GraphNode source_node = conections.get(i).getSource();
            int pos_node = findNode(destiny_node); //returns the pos of the destiny node
            if (!MinDistanceStatus.get(pos_node)){ //if the weight isn't final we change it
                MinDistance.set(pos_node, conections.get(i).getWeight() + pWeight); // we change the min weight of the node
                References.set(pos_node, conections.get(i)); //Sets the Arc to get to that node
            }
        }
    }
    
    
    
}
