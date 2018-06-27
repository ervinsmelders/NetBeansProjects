/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Ervin
 */
public class Kvadrats 
{
    private double malasgarums;
    private String Krasa;

    //veidoju divus konstruktrus, lai varetu izveidot objektu ar un bez parametriem
    public Kvadrats()
    {
        
    }
    
    public Kvadrats(double malasgarums, String Krasa) {
        this.malasgarums = malasgarums;
        this.Krasa = Krasa;
    }
    
    

    public double getMalasgarums() {
        return malasgarums;
    }

    public void setMalasgarums(double malasgarums) {
        if (malasgarums<0)
        {
            malasgarums=0;
        }
        this.malasgarums = malasgarums;
    }

    public String getKrasa() {
        return Krasa;
    }

    public void setKrasa(String Krasa) {
        this.Krasa = Krasa;
    }
    
    public double laukums()
    {
        return malasgarums*malasgarums;
    }
    public double perimetrs()
    {
        return this.malasgarums*4;
    }
    
    
}
