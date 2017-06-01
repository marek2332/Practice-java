/*
 Created by AsusPC on 04.12.2016.
*/

package com.practice.kreatorFaktur;

// rozszerzenia klasy Produkt
public class Towar extends Produkt {


    private int ilosc;
    private double cenajednostkowaNetto;


    public Towar (String nazwa, String jednostkaMiary, int ilosc,  double cenajednostkowaNetto, double wartoscNetto, int stawkaVAT, double wartoscBrutto){

        super(nazwa, wartoscNetto, stawkaVAT, wartoscBrutto, jednostkaMiary );
        this.ilosc = ilosc;
        this.cenajednostkowaNetto = cenajednostkowaNetto;

    }
    
    // nowe metody klasy towar
    public int Pobierzilosc(){
    
        return ilosc;
        
    }
    
    public double PobierzcenajednostkowaNetto(){
    
        return cenajednostkowaNetto;
        
    }

}
