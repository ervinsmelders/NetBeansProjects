/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Ervin
 */
public class Kvadrats implements Geometriskafigura {

    public double malasgarums;
    public String krasa;
    
    public double laukums() 
    {
        return malasgarums*malasgarums;
    }

    @Override
    public String krasa() 
    {
        return krasa;
    }

    @Override
    public double perimetrs() 
    {
        return malasgarums*4;
    }
    
}
