
package controller;

import internalLogic.ArcGraph;
import internalLogic.GooglePlaces;
import internalLogic.Graph;
import internalLogic.GraphNode;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Joseph Salas
 */
public class ProccessManagement {
    
    private GooglePlaces apiCall = new GooglePlaces();
    private Graph graphGame;
    private ArrayList<ArcGraph> Arcs  = new ArrayList<ArcGraph>();
    private ArrayList<GraphNode> totalNodes = new ArrayList<GraphNode>(); 
    
    public void requestJson(String latitude,String longitude,String radius,String typePlace) throws URISyntaxException, ParseException, IOException
    {
       
        ArrayList<String> places = new ArrayList<String>();
        places.add("cafe");
        places.add("bank");
        places.add("church");
        places.add("bus_station");
        places.add("liquor_store");
        places.add("museum");
        places.add("park");
        places.add("parking");
        places.add("restaurant");
        places.add("bar");
        
        for (int i=0;i<places.size();i++)
        {
          
            ArrayList<GraphNode> localizations = apiCall.mapDetails(latitude, longitude,radius,places.get(i));
            for (int j = 0; j<localizations.size();j++)
            {
              totalNodes.add(localizations.get(j));
            }
            
        }
        
        
    }
    
    
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
        for (int i = 0; i < totalNodes.size(); i++){
            GraphNode node_source = totalNodes.get(i);
            double lat1 = node_source.getLatitude();
            double lon1 = node_source.getLongitude();
            
            //Second for to get another node and compare it to first node
            for (int x = 0; i < totalNodes.size(); x++){
                GraphNode node_destiny = totalNodes.get(x);
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
    
    
}
