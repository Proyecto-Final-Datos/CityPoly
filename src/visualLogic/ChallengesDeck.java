/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

/**
 *
 * @author Joseph Salas
 */
public class ChallengesDeck{
    
    private Long Times; //times to visit the place
    private String Place; //type of place to visit
    private String Description;
    
    /**
     * Builder Method for the Challenge Class
     * @param Times It's value can be 1 or 2 (times to visit the place)
     * @param Place Place to visit
     */
    public ChallengesDeck(String pPlace, Long pTimes, String pDescription ) {
        this.Times = pTimes;
        this.Place = pPlace;
        this.Description = pDescription; 
    }

    //Getters and Setters
    public Long getTimes() {
        return Times;
    }

    public void setTimes(Long Times) {
        this.Times = Times;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    
}
