<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalLogic;

/**
 *
 * @author Joseph Salas
 */
public class Graph {
    
=======

package internalLogic;
import java.util.*;

public class Graph {
    
    private ArrayList<GraphNode> Nodes;// = new ArrayList<GraphNode>();
    private ArrayList<ArcGraph> Arcs;// = new ArrayList<Arc>();

    /**
     * Builder method for Graph class
     * @param Nodes
     * @param Arcs 
     */
    public Graph(ArrayList<GraphNode> Nodes, ArrayList<ArcGraph> Arcs) {
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
    
    public ArrayList<ArcGraph> getArcs() {
        return Arcs;
    }
    
    public void setArcs(ArrayList<ArcGraph> pArcs) {
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
    
>>>>>>> refs/remotes/origin/Joseph
}
