
package internalLogic;

import java.io.IOException;
import java.net.URISyntaxException;
import org.json.simple.parser.ParseException;

public class NewClass {
    
    
    public static void main(String[] args) throws URISyntaxException, ParseException, IOException 
    {
        GooglePlaces prueba = new GooglePlaces();
        prueba.photoAnalize("41.89543", "12.498910","1500");
    }
    
}
