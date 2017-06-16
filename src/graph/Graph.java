/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.*;

/**
 *
 * @author Alberto Obando
 */
public class Graph {
    
    private ArrayList<GraphNode> Nodes;// = new ArrayList<GraphNode>();
    private ArrayList<Arc> Arcs;// = new ArrayList<Arc>();

    /**
     * Builder method for Graph class
     * @param Nodes
     * @param Arcs 
     */
    public Graph(ArrayList<GraphNode> Nodes, ArrayList<Arc> Arcs) {
        this.Nodes = Nodes;
        this.Arcs = Arcs;
    }
    
    // getters and setters

    public ArrayList<GraphNode> getNodes() {
        return Nodes;
    }

    public void setNodes(ArrayList<GraphNode> pNodes) {
        this.Nodes = pNodes;
    }
    
    public ArrayList<Arc> getArcs() {
        return Arcs;
    }
    
    public void setArcs(ArrayList<Arc> pArcs) {
        this.Arcs = pArcs;
    }
    
    //Other Functions
    
    /**
     * Function to add a new node to the graph
     * @param pNode Node to be inserted
     */
    public void addNode(GraphNode pNode) {
        Nodes.add(pNode);
    }
    
    
    
}
