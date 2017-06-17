/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;
import java.util.ArrayList;
/**
 *
 * @author Joseph Salas
 */
public class Deck<T> {
    
     protected ArrayList<T> Cards = new ArrayList<T>(40);

    /**
     * Builder Method for the Deck Class
     */
    public Deck() {
    }
    
    public void add(T pData)
    {
        this.Cards.add(pData);
    }

    //Getter and Setter
    public ArrayList<T> getCards() {
        return Cards;
    }

    public void setCards(ArrayList<T> Cards) {
        this.Cards = Cards;
    }
    
}
