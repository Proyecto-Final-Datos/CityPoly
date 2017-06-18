/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

import java.util.ArrayList;

/**
 *
 * @author Alberto Obando
 */
public class Deck {
    
    private ArrayList Cards = new ArrayList(40);

    /**
     * Builder Method for the Deck Class
     */
    public Deck() {
    }

    //Getter and Setter
    public ArrayList getCards() {
        return Cards;
    }

    public void setCards(ArrayList Cards) {
        this.Cards = Cards;
    }
    
    
    
}
