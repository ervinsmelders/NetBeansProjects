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
public class Pasazierutransportlidzeklis extends Transportlidzeklis {
    int maxpasazieri;
    
    public Pasazierutransportlidzeklis(String razotajs, String marka, int gads, int maxpasazieri) {
        super(razotajs, marka, gads);
        
        this.maxpasazieri=maxpasazieri;
    }
    
}
