
package internalLogic;

import visualLogic.TypePlace;
import java.util.*;


public class GraphNode {
    
     private String Place; //Name of the Place to visit
    private String Thumbnail; //Tiene que ser el thumbnail del lugar -> URL
    private TypePlace Type; //Type of place to visit -> to know if its valid for 
    
    private List<GraphNode> shortestPath = new LinkedList<>();
     
    private Integer distance = Integer.MAX_VALUE;
     
    Map<GraphNode, Integer> adjacentNodes = new HashMap<>();
 
    public void addDestination(GraphNode destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
  
    public GraphNode(String pPlace) {
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

    public List<GraphNode> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<GraphNode> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<GraphNode, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<GraphNode, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
    
}
