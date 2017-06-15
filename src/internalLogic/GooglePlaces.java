
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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class GooglePlaces {
    
       private HttpEntity entity;
    
    public void mapDetails(String latitude,String longitude,String radius) throws URISyntaxException, ParseException, IOException
    {
        HttpClient httpclient = new DefaultHttpClient();

            URIBuilder builder = new URIBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+latitude+","+longitude+"&radius="+radius
                    + "&keyword=cruise&key=AIzaSyBxoUS7sbDYCMKhwfxO4oU_Qcr69SDtZBw");
            builder.setParameter("key","AIzaSyBxoUS7sbDYCMKhwfxO4oU_Qcr69SDtZBw");
            //builder.setParameter("placeid", url);
            //builder.setParameter("visualFeatures", "Description");
            builder.setParameter("language", "en");

            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers - replace this example key with your valid subscription key.
            request.setHeader("Content-Type", "application/json");
            // request.setHeader("Ocp-Apim-Subscription-Key", "cf86f75d31684af4b05e8a15fcf239ab");
            // Request body. Replace the example URL with the URL for the JPEG image of a celebrity.
            // StringEntity reqEntity = new StringEntity("{\"url\":\""+url+"\"}");
            // request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            entity = response.getEntity();
            String File = EntityUtils.toString(entity);
            System.out.println(File);


        /*    if (entity != null)
            {
               ArrayList<HashMap> Tags  = new ArrayList<HashMap>();
               JSONParser parser = new JSONParser();
               JSONObject jsonFile = (JSONObject) parser.parse(File);
               JSONObject descriptions = (JSONObject) jsonFile.get("description");
                ArrayList<String> a = (ArrayList<String>) descriptions.get("tags");
                ArrayList<JSONObject> b = (ArrayList<JSONObject>) descriptions.get("captions");
                String captionText = (String) b.get(0).get("text");
                UrlImage.setDescription(captionText);
                for( int i=0; i<3;i++ )
                    {
                        String[] TagName = a.get(i).toString().split(",");
                        String FinalTag = TagName[0];
         
                    }
            }
    */        
    }
    
    }
