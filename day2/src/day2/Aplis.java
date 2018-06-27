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
public class Aplis implements Geometriskafigura {

    public double radiuss;
    public String krasa;
    
    
    @Override
    public double laukums() 
    {
        return Math.PI*radiuss*radiuss;
    }

    @Override
    public String krasa() 
    {
        return krasa;
        
    }

    @Override
    public double perimetrs() 
    {
        return Math.PI*radiuss;
    }
    
}
