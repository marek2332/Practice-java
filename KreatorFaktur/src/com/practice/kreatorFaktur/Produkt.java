/*
 Created by AsusPC on 04.12.2016.
*/

package com.practice.kreatorFaktur; 

// tworzenia klasy Produkt
public class Produkt {

    // deklaracja zmiennych
    protected String nazwa;
    protected double wartoscNetto;
    protected int stawkaVAT;
    protected double wartoscBrutto;
    protected String jednostkaMiary;

    // konstruktor
    public Produkt(String nazwa, double wartoscNetto, int stawkaVAT, double wartoscBrutto, String jednostkaMiary) {

        this.nazwa = nazwa;
        this.wartoscNetto = wartoscNetto;
        this.stawkaVAT = stawkaVAT;
        this.wartoscBrutto = wartoscBrutto;
        this.jednostkaMiary = jednostkaMiary;
        
    }
    
    // metody dla wyswietlenia informacji o produktach
    public  String Nazwa(){
    
        return nazwa;
        
    }
    
    public double PobierzwartoscNetto(){
    
        return wartoscNetto;
        
    }
    
    public int PobierzstawkaVAT(){
    
        return stawkaVAT ;
        
    }
    
    public double PobierzwartoscBrutto(){
    
        return wartoscBrutto;
        
    }
    
    public String PobierzjednostkaMiary(){
    
        return jednostkaMiary;
        
    }

}
