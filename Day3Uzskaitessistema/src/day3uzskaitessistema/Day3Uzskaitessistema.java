/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzskaitessistema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Day3Uzskaitessistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       boolean darbojas = true;
       Scanner ievade =new Scanner(System.in);
       System.out.print("Ievadi uzņēmuma nosaukumu: ");
       Uznemums org = new Uznemums(ievade.next());
       System.out.println("Uzņēmums ir izveidots: SIA " + org.nosaukums);
       
       while (darbojas)
       {
          System.out.println("1 - Pievienot jaunu darbinieku: ");
          System.out.println("2 - Apskatīt visus darbiniekus: ");
          System.out.println("3 - Atlaist darbinieku: ");
          System.out.println("4 - Mainīt darbinieka dzimšanas datumu: ");
          System.out.println("5 - Iziet no programmas: ");
          
          int darbiba =ievade.nextInt();
          switch (darbiba)
          {
              case 1:
                  org.Addemployee();
                  break;
              case 2:
                  org.Printallemployees();
                  break;
              case 3:
                  org.Fire();
                  break;
              case 4:
                  org.Changedata();
                  break;
              case 5:
                  System.out.println("Uz tikšanos! ");
                  darbojas=false;
                  break;
              default:
                  System.out.println("Nepareiza darbība!");
                  break;
          }
       }
       
        /*Scanner ievade = new Scanner(System.in);
       System.out.print("Ievadi uzņēmuma nosaukumu: ");
       Uznemums org = new Uznemums(ievade.next());
       System.out.println("Uzņēmums ir izveidots- " + org.nosaukums);

        
       
       while (true)
       {
          System.out.println("1 - Pievienot jaunu darbinieku: ");
          System.out.println("2 - Apskatīt visus darbiniekus: ");
          System.out.println("3 - Lūdzu izvēlieties vienu no darbībām: ");
          System.out.println("4 - Lūdzu izvēlieties vienu no darbībām: ");
          
          int darbiba =ievade.nextInt();
          switch (darbiba)
        {
              case 1:
                  System.out.println("Lūdzu ievadit darbinieka vārdu: ");
                  String vards = ievade.next();
                  System.out.println("Lūdzu ievadit darbinieka uzvārdu: ");
                  String uzvards = ievade.next();
                  System.out.println("Lūdzu ievadit darbinieka dzimšans datumu (dd/mm/gggg): ");
                  String datums = ievade.next();
                  org.Addemployee(vards, uzvards, datums);
                  break;
              case 2:
                  for (int i=0; i<org.list.size(); i++)
                  {
                      System.out.println(org.list.get(i));
                  }
                  break;
                  
                  /*for(Darbinieks darbinieks : org.getallemployee());
                  {
                  System.out.println(org.getallemployee());
                //System.out.print(org.getallemployee().toString());
                  }
              case 3:
                  System.out.println("Lūdzu ievadit darbinieka vārdu, kuru atlaist: ");
                  String atlvards = ievade.next();
                  System.out.println("Lūdzu ievadit darbinieka uzvārdu, kuru atlaist: ");
                  String atluzvards = ievade.next();
                  for (int i=0; i<org.getallemployee().size(); i++)
                  {
                     if (org.getallemployee().get(i).vards.equalsIgnoreCase(atlvards));
                     {
                      System.out.println("Satur!");
                     }
                     else
                     {
                        System.out.println("Nesatur!"); 
                     }
                     
                  }
                  
                  
              
       }
       
       
       
    }  */ 
}
}