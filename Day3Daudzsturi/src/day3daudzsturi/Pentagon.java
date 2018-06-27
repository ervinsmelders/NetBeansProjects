/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3daudzsturi;

/**
 *
 * @author Ervin
 */
public class Pentagon implements Figura {
    int mala;

    public Pentagon(int mala) {
        this.mala = mala;
    }

    @Override
    public double perimeter() {
        return mala*5;
        
    }

    @Override
    public double area() {
        double rezultats1;
        double rezultats2;
        double rezultats3;
        rezultats1 = (Math.sqrt(5)*10)+25;
        rezultats2 = Math.sqrt(rezultats1);
        rezultats3 = (rezultats2*mala*mala)/4;
        return rezultats3;
    }
    
    
}
