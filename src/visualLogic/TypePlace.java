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
public enum TypePlace {
    
    BANK(0), BAR(1), BUSSTATION(2), COFFEESHOP(3), CHURCH(4), LIQUOR(5), MUSEUM(6), PARK(7),
    PARKING(8), RESTAURANT(9);
    
    private int value;
    
    private TypePlace(int value)
    {
        this.value = value;
    }	
    
    public int getValue() {
        return value;
    }
    
}
