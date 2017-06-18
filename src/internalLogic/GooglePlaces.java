
package internalLogic;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;



public class GooglePlaces {
    
       private HttpEntity entity;
    
    public ArrayList<GraphNode> mapDetails(String latitude,String longitude,String radius,String typePlace) throws URISyntaxException, ParseException, IOException
    {
        HttpClient httpclient = new DefaultHttpClient();
        ArrayList<GraphNode> nodeList = new ArrayList();    
        
        
            URIBuilder builder = new URIBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+latitude+","+longitude+"&radius="+radius
                    + "&type="+typePlace+"&key=AIzaSyBxoUS7sbDYCMKhwfxO4oU_Qcr69SDtZBw");
            builder.setParameter("key","AIzaSyBxoUS7sbDYCMKhwfxO4oU_Qcr69SDtZBw");
            builder.setParameter("language", "en");

            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers - replace this example key with your valid subscription key.
            request.setHeader("Content-Type", "application/json");
            HttpResponse response = httpclient.execute(request);
            entity = response.getEntity();
            String File = EntityUtils.toString(entity);
            //System.out.println(File);


            if (entity != null)
            {
                ArrayList<HashMap> location  = new ArrayList<HashMap>();
                JSONParser parser = new JSONParser();
                JSONObject jsonFile = (JSONObject) parser.parse(File);
                JSONArray locations =  (JSONArray) jsonFile.get("results");
               
                for( int i=0; i<locations.size();i++ )
                    {
                        JSONObject prueba = (JSONObject) locations.get(i);
                        try{
                             //Cambiar por ArrayList de Nodos
                           double rating =  (double) prueba.get("rating");
                            String name =  (String) prueba.get("name");
                            String icon =  (String) prueba.get("icon");
                            JSONArray type = (JSONArray) prueba.get("types"); 
                            String place =  (String) type.get(0);
                            double latitudePlace= (double) prueba.get("lat");
                            double longitudePlace= (double) prueba.get("lng");
                            GraphNode placeNode = new GraphNode(name,icon,place,rating,latitudePlace,longitudePlace);
                            nodeList.add(placeNode);
                            //System.out.println("ShortName: "+name+", "+"ImageIcon: "+icon+", "+"Rating: "+String.valueOf(rating)+", "+"Type: "+place);
                            
                        }catch(Exception e){} 
                        
                    }
                System.out.println("");
                System.out.println("");
               
                
            }
          return nodeList;
    }
    
    
    }
