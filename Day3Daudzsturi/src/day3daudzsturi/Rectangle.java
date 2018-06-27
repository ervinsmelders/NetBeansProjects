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
public class Rectangle implements Figura {

    int mala1;
    int mala2;

    public Rectangle(int mala1, int mala2) {
        this.mala1 = mala1;
        this.mala2 = mala2;
    }

    @Override
    public double perimeter() {
        return (mala1*2) + (mala2*2);
    }

    @Override
    public double area() {
        return mala1*mala2;
    }

  
    
}
