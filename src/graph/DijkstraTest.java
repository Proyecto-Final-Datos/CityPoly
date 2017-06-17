/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.*;

/**
 *
 * @author albertoobando
 */
public class DijkstraTest {
    
    private static ArrayList<Arc> Arcs = new ArrayList<Arc>();
    private static ArrayList<GraphNode> Nodes = new ArrayList<GraphNode>();
    
    public static void addLane(int pSource, int pDestiny, double pWeight){
        GraphNode Source_node = Nodes.get(pSource);
        GraphNode Destiny_node = Nodes.get(pDestiny);
        Arc temp_arc = new Arc(pWeight, Source_node, Destiny_node); //Creates the arc
        Source_node.getConections().add(temp_arc); //adds the reference to the arc
        Arcs.add(temp_arc); //adds the arc to the arc list of the graph
    }
    
    public static void main(String[] args){
        
        //Creates the array of nodes
        for (int i = 0; i < 8; i++){
            GraphNode new_node = new GraphNode("Node_" + i, "Link");
            Nodes.add(new_node);
        }
        //Node 0-A
        addLane(0, 0, 0.0); //test
        addLane(0, 1, 8.0);
        addLane(0, 3, 5.0);
        addLane(0, 2, 2.0);
        //Node 1-B
        addLane(1, 1, 0.0); //test
        addLane(1, 0, 8.0);
        addLane(1, 3, 2.0);
        addLane(1, 5, 13.0);
        //Node 2-C
        addLane(2, 2, 0.0); //test
        addLane(2, 0, 2.0);
        addLane(2, 3, 2.0);
        addLane(2, 4, 5.0);
        //Node 3-D
        addLane(3, 3, 0.0); //test
        addLane(3, 1, 2.0);
        addLane(3, 2, 2.0);
        addLane(3, 4, 1.0);
        addLane(3, 6, 3.0);
        addLane(3, 5, 6.0);
        //Node 4-E
        addLane(4, 4, 0.0); //test
        addLane(4, 2, 5.0);
        addLane(4, 3, 1.0);
        addLane(4, 6, 1.0);
        //Node 5-F
        addLane(5, 5, 0.0); //test
        addLane(5, 1, 13.0);
        addLane(5, 3, 6.0);
        addLane(5, 6, 2.0);
        addLane(5, 7, 3.0);
        //Node 6-G
        addLane(6, 6, 0.0); //test
        addLane(6, 4, 1.0);
        addLane(6, 3, 3.0);
        addLane(6, 5, 2.0);
        addLane(6, 7, 6.0);
        //Node 7-H
        addLane(7, 7, 0.0); //test
        addLane(7, 5, 3.0);
        addLane(7, 6, 6.0);
        
        Graph test_graph = new Graph(Nodes, Arcs);
        Dijkstra test_dijkstra = new Dijkstra(test_graph, Nodes.get(0));
        test_dijkstra.execute(); //Calculates the shortest path
        ArrayList<Arc> test_path = test_dijkstra.getPath( Nodes.get(7));
        //for (int x = test_dijkstra.getReferences().size() - 1; x > 0; x--){
        for (int x = test_path.size() - 1; x >= 0; x--){
            //System.out.println(test_dijkstra.getReferences().get(x).toString());
            System.out.println(test_path.get(x).toString());
        }
        
        
        
        
        
    }
    
    
}
