/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author albertoobando
 */
public class ProcessManagment {
    
    
    public double getDistance(float pLat1, float pLon1, float pLat2, float pLon2){
        double result = 0;
        
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
   
        return result;
    }
    
}
