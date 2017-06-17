
package controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import visualLogic.ChallengesDeck;
import visualLogic.CityDeck;
import visualLogic.Deck;
/**
 *
 * @author Joseph Salas
 */
public class JsonManager {
    
    
        private Deck<CityDeck> cityDeck = new Deck<CityDeck>();
        private Deck<ChallengesDeck> challengesDeck = new Deck<ChallengesDeck>();
    
    public void JsonRead(String pPath) throws ParseException, FileNotFoundException, IOException
    {
        ArrayList<String> CityName  = new ArrayList<String>();
        JSONParser parser = new JSONParser();
        JSONObject jsonFile = (JSONObject) parser.parse(new InputStreamReader(new FileInputStream(pPath)));  
        JSONArray cities =  (JSONArray) jsonFile.get("Cities_Cards");
        JSONArray challenges =  (JSONArray) jsonFile.get("Challenges_Cards");
        
        
        for( int i=0; i<cities.size();i++ )
        {
            JSONArray prueba = (JSONArray) cities.get(i);
            String cityName = (String) prueba.get(0);
            double latitude = (double) prueba.get(1);
            double longitude = (double) prueba.get(2);
            Long radious = (Long) prueba.get(3);
            cityDeck.add(new CityDeck(cityName,latitude,longitude,radious));
            //System.out.println("Name: "+cityName+","+"Latitude: "+latitude+","+"Longitude: "+longitude+","+"radious"+radious);
        }
        for(int i = 0; i<challenges.size();i++)
        {
            JSONArray prueba2 = (JSONArray) challenges.get(i);
            String type = (String) prueba2.get(0);
            Long times = (Long) prueba2.get(1);
            String description = (String) prueba2.get(2);
            challengesDeck.add(new ChallengesDeck(type,times,description));
            
        }
        
   
     }
    
    public void printDecks()
        {
            for (int i = 0; i<cityDeck.getCards().size();i++)
        {
            System.out.println(cityDeck.getCards().get(i).getName());
           
        }
        for (int i = 0; i<challengesDeck.getCards().size();i++)
        {
            System.out.println(challengesDeck.getCards().get(i).getPlace());
        }
            
        }

    public Deck<CityDeck> getCityDeck() {
        return cityDeck;
    }

    public void setCityDeck(Deck<CityDeck> cityDeck) {
        this.cityDeck = cityDeck;
    }

    public Deck<ChallengesDeck> getChallengesDeck() {
        return challengesDeck;
    }

    public void setChallengesDeck(Deck<ChallengesDeck> challengesDeck) {
        this.challengesDeck = challengesDeck;
    }
    
    
    
    
    
}
