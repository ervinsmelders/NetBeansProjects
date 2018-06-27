/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Ervin
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*//definē mainīgo kv1, izveidojot klases objektu
        Kvadrats kv1 = new Kvadrats();
        kv1.setMalasgarums(5.5);
        kv1.setKrasa("sarkans");
        double laukums = kv1.laukums();
        double perimetrs= kv1.perimetrs();
        
        
        Kvadrats kv2 = new Kvadrats(6, "melns");
        laukums =kv2.laukums();
        perimetrs = kv2.perimetrs();
        
       System.out.println("Kvadrata 2 laukums ir " + laukums);
       System.out.println("Kvadrata 2 perimetrs ir " + perimetrs);
       System.out.println("Kvadrāta 1 krasa ir " + kv1.getKrasa());*/
       
       
       
         
      Telpa t1 = new Telpa();
      t1.setNumurs (4);
      t1.setStavs(4);
      
      Telpa t2 = new Telpa();
      t1.setNumurs (5);
      t1.setStavs(6);
      
      Klase k1 = new Klase();
      k1.setNosaukums ("12b");
      k1.setTelpa (t1);
      
      Skolens sk1 =new Skolens();
      sk1.setVards ("Janis");
      sk1.setUzvards("Maiznieks");
      sk1.setEpasts("i@inbox.lv");
      sk1.setDzgads(1990);
      sk1.setKlase(k1);
      
      Skolotajs skol1 = new Skolotajs();
      skol1.setVards("Karlis");
      skol1.setUzvards("Boobans");
      skol1.setEpasts("skol@inbox.lv");
      
      Macibuprieksmets pr1 = new Macibuprieksmets();
      pr1.setNosaukums("Fizika");
      pr1.setPasniedzejs(skol1);
      pr1.setTelpa(t2);
      
      Vertejums vert1 = new Vertejums();
      vert1.setMacibuprieksmets(pr1);
      vert1.setAtzime(9);
      vert1.setSkolens(sk1);
     
     System.out.println(vert1.Informacija());
     
      Auto auto = new Auto();
      Lidmasina lidmasina = new Lidmasina();
      auto.parvietoties();
      lidmasina.parvietoties();
      parvietot(auto);
      parvietot(lidmasina);
      
      Direktors d = new Direktors();
      d.uzvards = "Liepins";
      d.vards = "Janis";
      //zemāk viens un tas pats
      System.out.println(d.toString());
      darbiniekaVards(d);
   
    }

    private static void darbiniekaVards(Direktors d) {
        System.out.println(d.toString());
    }

    private static void parvietot(Transportlidzeklis tr) {
        tr.parvietoties();
    }
    
}
