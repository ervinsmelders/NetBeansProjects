/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3banka;

/**
 *
 * @author Ervin
 */
public class Konts {
    Klients klients;
    double naudasatlikums;
    String valuta;

    /*public Konts(Klients klients, double naudasatlikums, String valuta) {
        this.klients = klients;
        this.naudasatlikums = naudasatlikums;
        this.valuta = valuta;
    }*/
    
    public Klients getCustomer()
    {
       return klients;
    }
    
    public String getCustomername()
    {
        return klients.vards;
    }
    
    public String getBalance()
    {
        return  naudasatlikums + " "+ valuta;
    }
    
    public void deposit(double amount)
    {
        naudasatlikums = amount+ naudasatlikums;
    }
    
    public void withdraw(double amount)
    {
        naudasatlikums = naudasatlikums-amount;
    }
    
    
}
