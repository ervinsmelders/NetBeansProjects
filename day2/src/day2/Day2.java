/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Kvadrats kv1 =new Kvadrats();
        kv1.malasgarums =4;
        kv1.krasa = "sarkana";
        System.out.println("kvadrata krasa:" + kv1.krasa());
        System.out.println("kvadrata laukums"+ kv1.laukums());
        System.out.println("kvadrata perimetrs"+ kv1.perimetrs());
        //vai
        //Izvade(kv1);
        
        Aplis a1 = new Aplis();
        a1.radiuss =5;
        a1.krasa = "dzeltena";
        System.out.println("Apļa krasa" + a1.krasa());
        System.out.println("Apļa laukums" + a1.laukums());
        System.out.println("Apļa perimetrs" + a1.perimetrs());
        //vai
        //Izvade(a1);
        
        Kravastransportlidzeklis kr1 = new Kravastransportlidzeklis("LAtvija", "BMW", 2010, 10000);
        System.out.println(kr1.toString());
        
    }
        
    private static void Izvade(Geometriskafigura figura) {
    System.out.println("krasa:" + figura.krasa());
    System.out.println("laukums" + figura.laukums());
    System.out.println("perimetrs "+ figura.perimetrs());
    
    
    

        
// TODO code application logic here
    }
    
}
