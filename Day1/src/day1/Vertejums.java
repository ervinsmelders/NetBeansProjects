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
public class Vertejums 
{
    public Macibuprieksmets Macibuprieksmets;
    public int Atzime;
    public Skolens Skolens;

    public Macibuprieksmets getMacibuprieksmets() {
        return Macibuprieksmets;
    }

    public void setMacibuprieksmets(Macibuprieksmets Macibuprieksmets) {
        this.Macibuprieksmets = Macibuprieksmets;
    }

    public int getAtzime() {
        return Atzime;
    }

    public void setAtzime(int Atzime) {
        this.Atzime = Atzime;
    }

    public Skolens getSkolens() {
        return Skolens;
    }

    public void setSkolens(Skolens Skolens) {
        this.Skolens = Skolens;
    }

    
    
    public String Informacija()
    {
        return "Skolens = " + Skolens.Vards +" "+ Skolens.Uzvards + ", Priekšmets= " + Macibuprieksmets.Nosaukums + ", Pasniedzējs= " + Macibuprieksmets.Pasniedzejs.Vards + " " + Macibuprieksmets.Pasniedzejs.Uzvards + ", Vērtējums= " + Atzime ;
    }

    void setSkolotajs(Skolotajs skol1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
