
package internalLogic;
import java.util.*;

public class Graph {
    private Set<GraphNode> nodes = new HashSet<>();
 
    // getters and setters

    public Set<GraphNode> getNodes() {
        return nodes;
    }

    public void setNodes(Set<GraphNode> nodes) {
        this.nodes = nodes;
    }
    
    //Other Functions
    
    /**
     * Function to add a new node to the graph
     * @param nodeA Node to be inserted
     */
    public void addNode(GraphNode nodeA) {
        nodes.add(nodeA);
    }
    
}
