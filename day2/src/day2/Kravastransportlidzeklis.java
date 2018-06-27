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
public class Kravastransportlidzeklis extends Transportlidzeklis 
{
    double ietilpiba;
    
    public Kravastransportlidzeklis(String razotajs, String marka, int gads, double ietilpiba) {
        //ar super izsauc konstruktoru, kas ir transportlidzeklim;
        super(razotajs, marka, gads);
        
    //ar super aizstāj zemāk esošās 3 rindinas
    //this.razotajs=razotajs;
    //this.marka=marka;
    //this.gads =gads;
    
    this.ietilpiba= ietilpiba;
    
    }
    public String toString()
    {
        //super veršas pie augstakas klases- Transportlidzeklis. this. pie esošas klases
        String teksts =super.toString();
        teksts += " ietilpiba: " +this.ietilpiba;
        return teksts;
    }
    
    
}
