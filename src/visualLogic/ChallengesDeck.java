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
public class ChallengesDeck {
    
    private int Times; //times to visit the place
    private TypePlace Place; //type of place to visit
    
    /**
     * Builder Method for the Challenge Class
     * @param Times It's value can be 1 or 2 (times to visit the place)
     * @param Place Place to visit
     */
    public ChallengesDeck(int Times, TypePlace Place) {
        this.Times = Times;
        this.Place = Place;
    }

    //Getters and Setters
    public int getTimes() {
        return Times;
    }

    public void setTimes(int Times) {
        this.Times = Times;
    }

    public TypePlace getPlace() {
        return Place;
    }

    public void setPlace(TypePlace Place) {
        this.Place = Place;
    }
    
}
