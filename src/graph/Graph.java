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
    
    private Set<Node> nodes = new HashSet<>();
 
    // getters and setters

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
    
    //Other Functions
    
    /**
     * Function to add a new node to the graph
     * @param nodeA Node to be inserted
     */
    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }
    
    
    
}
