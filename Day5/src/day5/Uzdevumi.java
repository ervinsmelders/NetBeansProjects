/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Uzdevumi 
{
    
    private static Scanner ievade = new Scanner(System.in);
    public static void Piemeri()
    {
        System.out.println("Ievadi valsti");
        String valsts = ievade.next().toLowerCase();
        switch(valsts)
        {
            case "latvija":
            System.out.println("Rīga");
            break;
            
            case "lietuva":
            System.out.println("Viļņa");
            break;
            
            default:
            System.out.println("Nezinama valsts");
            break;
        }
    }
    public static void operacijas()
    {
        System.out.println("Ievadi skaitli 1:" );
        int skaitlis1 = ievade.nextInt();
        System.out.println("Ievadi darbību + - * /:" );
        char op1 = ievade.next().charAt(0);
        System.out.println("Ievadi skaitli 2:" );
        int skaitlis2 = ievade.nextInt();
        System.out.println("Ievadi darbību + - * /:" );
        char op2 = ievade.next().charAt(0);
        System.out.println("Ievadi skaitli 3:" );
        int skaitlis3 = ievade.nextInt();
        double rezultats;
        if(op1=='*'|| op1=='/')
        {
            rezultats = aprekins(skaitlis1,skaitlis2,op1);
            rezultats = aprekins(rezultats,skaitlis3,op2);
        }
        else
        {
            rezultats = aprekins(skaitlis2,skaitlis3,op2);
            rezultats = aprekins(skaitlis1,rezultats,op1);
        }
        System.out.println("Rezultats ir: " + rezultats);
                
        
    }
    private static double aprekins(double skaitlis1, double skaitlis2, char op)
        {
            switch(op)
            {
                case '*':
                    return skaitlis1*skaitlis2;
                
                case '/':
                    return skaitlis1/skaitlis2;
                    
                case '+':
                    return skaitlis1+skaitlis2;
                
                case '-':
                return skaitlis1-skaitlis2;
                
                default:
                return 0;

            }   
        }
    public static void Masivisaraksti()
    {
        int[]skaitlumasivs =new int[3];
        skaitlumasivs[0]=5;
        skaitlumasivs[1]=9;
        skaitlumasivs[2]=1;
        
        int[]skaitlumasivs2 ={5,9,1};
        int masivaieraksti =skaitlumasivs2.length;
        int tresaisskaitlis = skaitlumasivs2[2];
        boolean ircetri=false;
        for(int skaitlis: skaitlumasivs2)
        {
            System.out.println(skaitlis);
            if(skaitlis==4)
            {
                System.out.println("Skaitlis 4 ir masiva");
                ircetri =true;
            }
        }
        if(!ircetri)
        {
            System.out.println("Skaitlis 4 nav masīvā");
        }
        
        ArrayList<String>tekstasaraksts= new ArrayList<String>();
        tekstasaraksts.add("teksts1");
        tekstasaraksts.add("teksts2");
        tekstasaraksts.add("teksts3");
        int sarakstaieraksti = tekstasaraksts.size();
        String tresaisvards =tekstasaraksts.get(2);
        for (String vards: tekstasaraksts)
        {
            System.out.println(vards);
        }
    }
}
