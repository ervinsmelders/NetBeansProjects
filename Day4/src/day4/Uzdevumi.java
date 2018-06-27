/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Ervin
 */
public class Uzdevumi 
{
    private static Scanner ievade = new Scanner (System.in);
    
    //int skaitlis;
    public void Piemeri()
    {

        for (int i=1; i<=10; i++)
        {
            //cikls no 1 lidz 10
            System.out.println("i= "+ i);
        }
        
        //cikls no 5 līdz 1;
        int N=5;
        while (true)
        {
            if (N==0)
            {
                break;
            }
            System.out.println("N= "+ N);
            N--;
        }
    }
    public static void Piemeri2()
    {
        //nevar izmantot mainīgo (skaitlis), jo static...
        for (int i=1; i<=10; i++)
        {
            //cikls no 1 lidz 10
            System.out.println("i= "+ i);
        }
        
        //cikls no 5 līdz 1;
        int N=5;
        while (true)
        {
            if (N==0)
            {
                break;
            }
            System.out.println("N= "+ N);
            N--;
        }
    }
    
    public static void naturalieskaitli()
    {
        System.out.println("Lūdzu ievadiet skaitli: ");
        int skaitlis = ievade.nextInt();
        int summa =0;
        for (int i =1; i<=skaitlis; i++ )
        {
            System.out.println(i);
            summa =summa +i;
        }
        System.out.println("Summa = " + summa);
        
    }
    public static void Nskaitli()
    {
        System.out.println("Lūdzu ievadiet N skaitli: ");
        int N = ievade.nextInt();
        int summa = 0;
        double videjavertiba;
        for (int i=0; i< N; i++)
        {
            System.out.println("Lūdzu ievadiet skaitli");
            int skaitlis =ievade.nextInt();
            summa = summa+skaitlis;       
        }
        videjavertiba = (double)summa/N;
        System.out.println("Summa = " + summa);
        System.out.println("Vidējā vērtība ir: " + videjavertiba);
    }
    
    public static void skaitlukubi()
    {
         System.out.println("Lūdzu ievadiet N skaitli: ");
         int N =ievade.nextInt();
         for (int i=1; i<=N; i++)
         {
             System.out.println(i +"=" + i*i*i);
         }
    }
    public static void rindutrijsturis()
    {
        System.out.println("Lūdzu ievadiet rindu skaitu");
        int N = ievade.nextInt();
        for (int i = 1; i<=N; i++)
        {
            for (int z=0; z<i;z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rezgis()
    {
        System.out.println("Lūdzu ievadiet N skaitli");
        int n = ievade.nextInt();
        for (int i=1; i<=n;i++)
        {
            if(i%2==0)
            {
                for (int z=n; z>=1; z--)
                {
                 System.out.print(z);
                }
            }

            else if(i%2!=0)
            {
                for (int z=1; z<=n; z++)
                {
                    System.out.print(z);
                }
            }
            System.out.println();
            
        }     
    }
    public static void izvadepreteji()
    {
        System.out.println("Lūdzu ievadiet N skaitli");
        int n = ievade.nextInt();
        int skaitlis;
        while (n>0)
        {
            skaitlis = n%10;
            System.out.print(skaitlis);
            n = n/10;
        }
        
    }
    public static void skaitlupiramida()
    {
        System.out.println("Ievadi rindu skaitu piramidai");
        int n = ievade.nextInt();
        int skaitlis=1;
        for (int i=1; i<=n; i++)
        {
            for (int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for (int z=1; z<=i;z++)
            {

                System.out.print(skaitlis + " ");
                skaitlis++;
            }
            System.out.println();
        }
        
    }
            
            
            
            
    
    
    
    
    
    
    
    
}
