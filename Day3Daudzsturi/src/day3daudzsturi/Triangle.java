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
public class Triangle implements Figura {
    int mala1;
    int mala2;
    int mala3;

    public Triangle(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
    }

    @Override
    public double perimeter() {
        return mala1+mala2+mala3;
    }
    @Override
    public double area() {
        double pusp;
        double rezultats1;
        pusp = ((double)(mala1+ mala2+ mala3)/2);
        rezultats1 = pusp*(pusp-mala1)*(pusp-mala2)*(pusp-mala3);
        return Math.sqrt(rezultats1);
    }
        
    
    
}
