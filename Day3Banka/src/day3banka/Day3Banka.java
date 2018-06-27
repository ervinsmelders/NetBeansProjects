/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3banka;

import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Day3Banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner ievade = new Scanner (System.in);  
    System.out.print("Ievadi vārdu: ");
    String vards = ievade.next();
    System.out.print("Ievadi uzvārdu: ");
    String uzvards = ievade.next();
    System.out.print("Ievadi savu dzimumu: V (vīrietis) vai S(sieviete) ");
    char dzimums = ievade.next().charAt(0);
    dzimums = Character.toUpperCase(dzimums);
    /*while (true)
    {
        if (dzimums != 'F'|| dzimums != 'V')
        {
            System.out.println("Nepareizi! Ievadi V vai S!");
            dzimums = ievade.next().charAt(0);
            dzimums = Character.toUpperCase(dzimums);
        }
        else
        {
            break;
        }      
    }*/
    
    Klients kl1 = new Klients(vards,uzvards,dzimums);
    Konts ko1 = new Konts();
    ko1.klients =kl1;
    ko1.naudasatlikums =0;
    ko1.valuta ="EUR";


//Konts ko1 = new Konts(kl1, 0, "EUR");
    
    while (true)
    {
        
        System.out.println("Lūdzu piespiediet vajadzīgo numuru");
        System.out.println("1.numurs - Pārbaudīt klienta vārdu");
        System.out.println("2.numurs - Iegūt pilnu informāciju par klientu");
        System.out.println("3.numurs - Uzzināt klienta konta atlikumu");
        System.out.println("4.numurs - Iemaksāt naudu kontā");
        System.out.println("5.numurs - Izņemt naudu no konta");
        System.out.println("6.numurs - Iziet no bankas");
        int darbiba = ievade.nextInt();
        
        switch(darbiba)
        {
            case 1:
            System.out.println("Klienta vārds ir: " + ko1.getCustomername());
            break;
            
            case 2:
            System.out.println(ko1.getCustomer());
            break;
            
            case 3:
            System.out.println("Jūsu konta atlikums: " + ko1.getBalance());
            break;
            
            case 4:    
            System.out.println("Lūdzu ievadiet iemaksas summu: ");
            double iemaksa = ievade.nextDouble();
            ko1.deposit(iemaksa);
            System.out.println(iemaksa + " " + ko1.valuta + " veiksmīgi iemaksāti Jūsu kontā");
            break;    
            
            case 5:    
            System.out.println("Cik naudas vēlaties izņemt: ");
            boolean nepareizi =true;
            double izmaksa = ievade.nextDouble();
            while (nepareizi==true)
            {
                if (ko1.naudasatlikums<izmaksa)
                {
                    System.out.println("Nepietiek līdzekļi! Kontā ir: " + ko1.naudasatlikums + " " + ko1.valuta);
                    
                }
                else
                {
                    nepareizi = false;
                    ko1.withdraw(izmaksa);
                    System.out.println(izmaksa + " " + ko1.valuta + " veiksmīgi izņemti no Jūsu konta");
                    
                }
            }
            break;
           
            case 6:    
            System.out.println("Uz tikšanos! ");
            return;    
            
            default:
            System.out.println("Nepareiza darbība! Mēģiniet atkal!");
            break;
        }   
    }
    }
}
