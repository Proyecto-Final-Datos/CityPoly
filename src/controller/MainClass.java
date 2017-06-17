/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Joseph Salas
 */
public class MainClass {
    
     public static void main(String[] args) throws ParseException, IOException
    {
        JsonManager prueba = new JsonManager();
        prueba.JsonRead("C:\\Users\\Joseph Salas\\Desktop\\CardsGame.json");
    }
    
}
