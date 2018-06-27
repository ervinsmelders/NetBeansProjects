/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3banka;

/**
 *
 * @author Ervin
 */
public class Klients {
    String vards;
    String uzvards;
    char dzimums;

    public Klients(String vards, String uzvards, char dzimums) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.dzimums = dzimums;
    }
    
    

    
    
    @Override
    public String toString() {
        return "Klients{" + "vards=" + vards + ", uzvards=" + uzvards + ", dzimums=" + dzimums + '}';
    }
    
    
            
            
}
