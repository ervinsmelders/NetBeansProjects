/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzskaitessistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Uznemums 
{
    Scanner ievade =new Scanner(System.in);
    public String nosaukums;
    ArrayList<Darbinieks> saraksts = new ArrayList<Darbinieks>();
    
    public Uznemums(String nosaukums) {
        this.nosaukums = nosaukums;
    }
    
    public void Addemployee()
    {
        System.out.println("Ievadi darbinieka vārdu: ");
        String vards = ievade.next();
        System.out.println("Ievadi darbinieka uzvārdu: ");
        String uzvards = ievade.next();
        System.out.println("Ievadi darbinieka dzimšanas datumu formātā dd/mm/gggg: ");
        String dzimsanasdiena = ievade.next();
        saraksts.add(new Darbinieks(vards, uzvards, dzimsanasdiena));
    }
    public void Printallemployees()
    {
        for (Darbinieks darbinieks: saraksts)
        {
            System.out.println(darbinieks);
        }
    }
    public void Fire()
    {
        System.out.println("Ievadi darbinieka vārdu: ");
        String vards = ievade.next();
        System.out.println("Ievadi darbinieka uzvārdu: ");
        String uzvards = ievade.next();
        for (int i=0; i<saraksts.size(); i++)
        {
            if (vards.equalsIgnoreCase(saraksts.get(i).vārds) && uzvards.equalsIgnoreCase(saraksts.get(i).uzvards))
            {
                saraksts.remove(i);
            }
        }
    }
    public void Changedata()
    {
        System.out.println("Ievadi darbinieka vārdu: ");
        String vards = ievade.next();
        System.out.println("Ievadi darbinieka uzvārdu: ");
        String uzvards = ievade.next();
        for (int i=0; i<saraksts.size(); i++)
        {
            if (vards.equalsIgnoreCase(saraksts.get(i).vārds) && uzvards.equalsIgnoreCase(saraksts.get(i).uzvards))
            {
                System.out.println(saraksts.get(i));
                System.out.println("Ludzu ievadiet jaunu dzimsanas datumu formata dd/mm/gggg: ");
                saraksts.get(i).dzimsanasdatums = ievade.next();
                   
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    /*String nosaukums;
    ArrayList<Darbinieks>list;

    public Uznemums(String nosaukums) {
        this.nosaukums = nosaukums;
        this.list = new ArrayList<Darbinieks>();
    }
    
    public void Addemployee(String vards, String uzvards, String dzimsanasdiena)
    {
        list.add(new Darbinieks(vards, uzvards, dzimsanasdiena));
    }
    
    public ArrayList<Darbinieks> getallemployee()
    {
        return list;
    }*/

    
}
