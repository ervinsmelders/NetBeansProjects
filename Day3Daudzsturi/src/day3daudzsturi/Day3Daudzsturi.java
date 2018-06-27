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
public class Day3Daudzsturi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square s1 =new Square(5);
        s1.perimeter();
        s1.area();
        
        Rectangle r1 =new Rectangle(5,2);
        r1.perimeter();
        r1.area();
        
        Triangle t1 = new Triangle (5,3,4);
        t1.perimeter();
        t1.area();
        
        Pentagon p1 =new Pentagon(5);
        p1.perimeter();
        p1.area();
        
        dati(s1);
        dati (r1);
        dati (t1);
        dati (p1);
        
    }
    private static void dati (Figura fg)
        {
            System.out.println("Jūsu perimetrs ir: "+ fg.perimeter() + ", perimetrs: " + fg.area());
        }
    
}
