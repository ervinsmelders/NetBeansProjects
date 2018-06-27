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
public class Square implements Figura 
{
    int mala;

    public Square(int mala) {
        this.mala = mala;
    }

    @Override
    public double perimeter() {
       return mala*4;
    }

    @Override
    public double area() {
        return mala*mala;
    }   
}
