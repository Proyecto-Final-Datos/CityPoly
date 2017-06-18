    
package internalLogic;

/**
 *
 * @author Joseph Salas
 */
public class ArcGraph {
    
    private double weight; //Distance less than 50 meters between two Nodes
    private GraphNode Source; //Departs from here
    private GraphNode Destiny; //Gets here

    /**
     * Builder method for the arc Class
     * @param weight Distance between the places < 50mts
     * @param Source Source Node
     * @param Destiny Destiny Node
     */
    public ArcGraph(double weight, GraphNode Source,GraphNode Destiny) {
        this.weight = weight;
        this.Source = Source;
        this.Destiny = Destiny;
    }

    //Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GraphNode getSource() {
        return Source;
    }
    
    public void setSource(GraphNode Source) {
        this.Source = Source;
    }
    
    public GraphNode getDestiny() {
        return Destiny;
    }

    public void setDestiny(GraphNode Destiny) {
        this.Destiny = Destiny;
    }
    
    @Override
    public String toString() {
        return Source + " " + Destiny;
    }
    
}
