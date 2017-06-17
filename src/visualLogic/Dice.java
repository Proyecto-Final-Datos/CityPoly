/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Joseph Salas
 */
public class Dice {
    
  
    public int generateRandom()
    {
        Random randomNum = new Random();
        int ran = randomNum.nextInt(7-1)+1;
        return ran;
    }
    
    
    
}
