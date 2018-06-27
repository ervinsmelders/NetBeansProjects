/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Ervin
 */
public class Card 
{
    //H,S,D/C
    private char suit;
    //J,O,K,A,10,
    private String value;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    public String getName()
    {
         return String.format(this.suit + " "+ this.value);
    }
    
    public int getValue()
    {
        switch(this.value)
        {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.valueOf(this.value);
            
        }
    }
}
