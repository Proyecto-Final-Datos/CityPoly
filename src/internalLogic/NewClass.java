
package internalLogic;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;

public class NewClass {
    
    
    public static void main(String[] args) throws URISyntaxException, ParseException, IOException
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
            GooglePlaces prueba = new GooglePlaces();
            prueba.mapDetails("12.498910","41.89543","1500",places.get(i));
        }
        
    }
    
}
