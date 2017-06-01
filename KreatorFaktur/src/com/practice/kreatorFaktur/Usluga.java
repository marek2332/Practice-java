package com.practice.kreatorFaktur;

// rozszerzenia klasy Produkt
public class Usluga extends Produkt {

    private int liczbaRoboczogodzin;
    private int cenaRoboczogodzin;

    //konstruktor
    public Usluga(String nazwa, String jednostkaMiary, int liczbaRoboczogodzin, int cenaRoboczogodzin, double wartoscNetto, int stawkaVAT, double wartoscBrutto){

        super(nazwa, wartoscNetto, stawkaVAT, wartoscBrutto, jednostkaMiary );
        this.liczbaRoboczogodzin = liczbaRoboczogodzin;
        this.cenaRoboczogodzin = cenaRoboczogodzin;


    }
    
    // nowe metody klasy towar
    public int PobierzliczbaRoboczogodzin(){
    
        return liczbaRoboczogodzin;
        
    }
    
    public int PobierzcenaRoboczogodzin(){
    
        return cenaRoboczogodzin;
        
    }
}
