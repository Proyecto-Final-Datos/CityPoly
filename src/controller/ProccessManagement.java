
package controller;

import internalLogic.ArcGraph;
import internalLogic.Dijkstra;
import internalLogic.GooglePlaces;
import internalLogic.Graph;
import internalLogic.GraphNode;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Random;
import org.json.simple.parser.ParseException;
import visualLogic.Player;

/**
 *
 * @author Joseph Salas
 */
public class ProccessManagement {
    
    private GooglePlaces apiCall = new GooglePlaces();
    private Graph graphGame;
    private ArrayList<ArcGraph> Arcs  = new ArrayList<ArcGraph>();
    private ArrayList<GraphNode> totalNodes = new ArrayList<GraphNode>(); 

    public ProccessManagement() {
    }
    
    public Graph requestJson(String latitude,String longitude,String radius) throws URISyntaxException, ParseException, IOException
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
              if(repeatedNodes(totalNodes,localizations.get(j).getPlace())!=true)
              {
                  totalNodes.add(localizations.get(j));
              }else{}
              
            }
            
        }
        setArcs(); //Create arcs of thr graph
        deleteNodes();
        
        graphGame = new Graph(totalNodes, Arcs);
        System.out.println("dddd");
        
        return graphGame;
        
    }
    
    
     public double getDistance(double pLat1, double pLon1, double pLat2, double pLon2){
        double result = 0.0;
        
        //double radioTierra = 3958.75;//en millas  
        double earthRadious = 6371;//en kilómetros  
        double dLat = Math.toRadians(pLat2 - pLat1);  
        double dLng = Math.toRadians(pLon2 - pLon1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(pLat1)) * Math.cos(Math.toRadians(pLat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        result = earthRadious * va2; 
        result = result * 1000; //we divide by 1000 to get the result in meters.
   
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
            for (int x = 0; x < totalNodes.size(); x++){
                GraphNode node_destiny = totalNodes.get(x);
                double lat2 = node_destiny.getLatitude();
                double lon2 = node_destiny.getLongitude();
                
                //We begin the process to se if the arc can be created
                double distance = getDistance(lat1, lon1, lat2, lon2);
                if (distance <= 50.0){ //If it is in the roght range create the arc
                    ArcGraph temp_arc = new ArcGraph(distance, node_source, node_destiny);
                    node_source.getConections().add(temp_arc); //we add the arc reference to the node_source
                    //System.out.println(temp_arc.toString());
                    Arcs.add(temp_arc); //we add the arc to the arc list of the graph
                }
            }
        }
    }
    
    //Function for search repeated nodes
    
    public boolean repeatedNodes(ArrayList<GraphNode> ArrayNodes,String namePlace)
    {
        boolean result = false;
        for(int v=0 ;v<ArrayNodes.size();v++)
        {
         if(ArrayNodes.get(v).getPlace().equals(namePlace))
         {
             result = true;
             return result;
         }   
        }
        return result;
    }
    
    
    /**
    *Function to get the route a player has to go to complete all Challenges
    * @param pPlayer The player we want to know the route
    */
    public void getRoute(Player pPlayer){
        
        //First for to go through all the challenge cards
        for (int i = 0; i < pPlayer.getChallenges().size(); i++){

            //We get the data we need from the i pos challenge
            Long temp_times = pPlayer.getChallenges().get(i).getTimes(); //times to visit certain type place
            String temp_type = pPlayer.getChallenges().get(i).getPlace(); //type of place we have to visit

            //Second for to get to the type places temp_times
            for (int x = 0; i < temp_times; x++){
                
                //We execute a cicle to calculate the route for one challenge
                Dijkstra temp_route = new Dijkstra(graphGame, pPlayer.getStartNode());
                temp_route.execute(); //Calculates Dijkstra
                ArrayList<GraphNode> posible_nodes = getTypeList(temp_type); //gets the array of posible nodes to visit
                GraphNode temp_destiny = getMinDistanceNode(temp_route, posible_nodes); //sets the node we have to get to
                ArrayList<ArcGraph> temp_path = temp_route.getPath(temp_destiny); //Find the path to that node
                
                //We start to add the path to the player
                for (int y = temp_path.size() - 1; x >= 0; x--){ //we add all the arc references to the Players list
                    pPlayer.getChallengePath().add(temp_path.get(y)); //we add all the arcs we found
                }
                
                //We set the new source node for the player
                pPlayer.setStartNode(temp_destiny); 
            }
        }
    }

    /**
    * Function to get the list of nodes of the desired type
    * @param pType Type of nodes we want to find
    * @return result Returns a list of all nodes from the desired type
    */
    public ArrayList<GraphNode> getTypeList(String pType){
        
        ArrayList<GraphNode> result = new ArrayList<GraphNode>();

        for (int i = 0; i < totalNodes.size() - 1; i++){
            if (totalNodes.get(i).getType().equals(pType)){ //if the type is the same
                result.add(totalNodes.get(i));
            }
        }

        return result;
    }

    /**
     * Function to get the node with the lowest weight to get to
     * @param pDijkstra Dijkstra object for the source node we want
     * @param pPosible_nodes List of possible nodes to visit
     * @return 
     */
    public GraphNode getMinDistanceNode(Dijkstra pDijkstra, ArrayList<GraphNode> pPosible_nodes){
        GraphNode result = null;
        double temp_weight = Double.MAX_VALUE; //weight to compare to all the other nodes
        int pos_node = 0; //Position of the node with the minimum weight
        ArrayList<Double> min_distance = pDijkstra.getMinDistance(); //Gets the list of min distance from dijkstra
      
        //Firt for to get the weight of each node and compare it 
        for (int i = 0; i < pPosible_nodes.size(); i++){
            GraphNode temp_node = pPosible_nodes.get(i); //Gets the node we want to know the weight
            int temp_pos = pDijkstra.findNode(temp_node); //Gets the position of the node
            if (min_distance.get(temp_pos) < temp_weight){ //if the weight we find is lower than the one we have
                temp_weight = min_distance.get(temp_pos); //updates the weight
                pos_node = temp_pos; //updates the position of the node we want
            }
        }
        result = totalNodes.get(pos_node); //sets the result as the node with the minimum weight
      
        return result;
    }
    
    public GraphNode generateRandomNode()
    {
        Random r = new Random();
        int randomNode = r.nextInt(totalNodes.size() - 2) + 2;
        
        return totalNodes.get(randomNode);
    }
    
    /**
     * Function to delete all nodes that only have a connection to themselves
     */
    public void deleteNodes(){
        
        ArrayList<Integer> pos_list = new ArrayList<Integer>();
        
        //For to go trough all the nodes
        for (int i = 0; i < totalNodes.size(); i++){
            if (totalNodes.get(i).getConections().size() == 1){
                pos_list.add(i); //adds the position to be deleted
            }
        }
        
        int pos_corrector = 0;
        //For to delete all the nodes
        for (int x = 0; x < pos_list.size(); x++){
            totalNodes.remove(pos_list.get(x) - pos_corrector);
            pos_corrector++; //we adjust the pos_corrector
        }
        
    }
    
    
    /**
     * Function to move the player pTimes in its path to complete the game
     * Also adds the stars of the node it has visited
     * @param pTimes Amount of nodes to go through
     * @param pPlayer Player that is moving
     */
    public void movePlayer(int pTimes, Player pPlayer){
        ArrayList<ArcGraph> challengePath = pPlayer.getChallengePath(); //Gets the path of the Player
        
        //Fist for to go through pTimes nodes
        for (int i = 0; i < pTimes; i++){
            ArcGraph route = challengePath.get(0); //Gets the first node of the path
            pPlayer.setStars(pPlayer.getStars() + challengePath.get(0).getDestiny().getRating());
            pPlayer.setStartNode(route.getDestiny());
            challengePath.remove(0); //we remove the arc we just went through
        }
        
        pPlayer.setChallengePath(challengePath); //we set the new path that doesnt have the nodes he went through
    }
    
    
}
