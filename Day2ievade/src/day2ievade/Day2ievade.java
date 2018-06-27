/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ievade;

import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Day2ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Scanner ievade = new Scanner (System.in);
    System.out.print("Ievadi skaitli");
    int skaitlis =ievade.nextInt();
    System.out.println("Tu ievadiji skaitli" + skaitlis);*/
        // TODO code application logic here
        
    //vardaievade();
    //graduievade();
    brauciens();
            
    }
    static void vardaievade()
    {
    Scanner ievade = new Scanner (System.in);  
    System.out.print("Ievadi vārdu: ");
    String vards = ievade.next();
    System.out.print("Ievadi uzvārdu: ");
    String uzvards = ievade.next();
    
    System.out.printf("Tevi sauc %s %s\n", vards, uzvards);
    }
    
static void graduievade()
{
    Scanner ievade= new Scanner (System.in);
    System.out.println("Ievadi gradus");
    int gradi = ievade.nextInt();
    System.out.println("Ievadi mervienibu");
    String merv = ievade.next();
    //vai
    //char merv =ievade.next().charAt(0);
    merv =merv.toUpperCase();
    if (merv.equals("F"))
    {
        System.out.println((gradi-32)/1.8+ "C");
    }
    else if(merv.equals ("C"))
    {
        System.out.println(gradi*1.8 + 32 + "F");
    }
    else
    {
         System.out.println("Nezinama mervieniba");
    }
    
}
static void brauciens()
{
    Scanner ievade = new Scanner (System.in);
    System.out.println("Ievadi attālumu km: ");
    int km = ievade.nextInt();
    System.out.println("Ievadi laiku minutes: ");
    int laiksmin = ievade.nextInt();
    System.out.println("Ievadi patereto degvielu litros ");
    int deglitri = ievade.nextInt();
    
    double laiksh =(double)laiksmin/60;
    int laikssek = laiksmin*60;
    double atrumskmmin = (double)km/laiksmin;
    double atrumskmh = (double)km/laiksh;
    double viddeglit = (double)km/deglitri;
    double viddegpat =100*(double)deglitri/km;
    System.out.println("Laiks stundas ir: " + laiksh);
    System.out.println("Laiks sekundes ir: " + laikssek);
    System.out.println("Jūsu ātrums (km/min) ir : " + atrumskmmin);
    System.out.println("Jūsu ātrums (km/h) ir: " + atrumskmh);
    System.out.println("Jūsu vidējais degvielas patēriņš (km/l) ir : " + viddeglit);
    System.out.println("Jūsu vidējais degvielas patēriņš (l/100km) ir: " + viddegpat);
    
    
    
}





    
}
