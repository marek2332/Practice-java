/* 
 Nazwa: UrzadzeniaMuzyczne
 Autor: Markiian Danchyshyn
 
 Opis: Modyfikacja programu w taki sposob, aby byla uwzgledniona nowa kategoria urzadzen muzycznych.
*/

package com.practice.urzadzeniaMuzyczne;

interface Wlacza {

    public void wlacz();
    public void wylacz();
    public boolean czyDziala();
    
}

interface Odtwarza {

    public void start();
    public void stop();
    public void pauza();
    
}

abstract class Odtwarzacz implements Wlacza, Odtwarza {

    protected int glosnosc;
    private boolean dziala;
    protected String marka;

    public Odtwarzacz(String marka){
    
        this.marka = marka;
        dziala = false;
        
    }

    public void wlacz(){
    
        dziala = true;
        
    }

    public void wylacz(){
    
        dziala = false;
        
    }
    
    public boolean czyDziala() {
    
        return dziala;
        
    }

    public abstract void glosniej();
    public abstract void ciszej();
    
}

class OdtwarzaczCD extends Odtwarzacz {

    public OdtwarzaczCD (String marka){
    
        super(marka);
        glosnosc = 10;
        
    }

    public void glosniej(){
    
        glosnosc++;
        
    }
    
    public void ciszej(){
    
        glosnosc--;
        
    }

    public void start(){
    
        System.out.println ("Odtwarzacz CD odtwarza");
        
    }
    
    public void stop(){
    
        System.out.println ("Odtwarzacz CD nie odtwarza");
        
    }
    
    public void pauza(){
    
        System.out.println ("Odtwarzacz CD zatrzymany");
        
    }

    public String toString() {
    
        return "Odtwarzacz CD marki: " + marka + " jest " + 
         ( czyDziala() ? "wlaczony" : "wylaczony") + " Glonosc: " + glosnosc;
    }
}

// klasa reprezentujaca prosty odtwarzacz MP3 dziedziczaca z klasy Odtwarzacz
class OdtwarzaczMP3 extends Odtwarzacz{

    // deklaracja zmiennych
    private int pojemnosc;
    private int bateria;

    // konstruktor klasy
    public OdtwarzaczMP3(String marka, int pojemnosc, int bateria){

        super(marka);
        this.pojemnosc = pojemnosc;
        this.bateria = bateria;
        glosnosc = 5;

    }
    
    // metody klasy OdtwarzaczMP3
    public void glosniej(){
    
        glosnosc++;

    }
    
    public void ciszej(){
    
        glosnosc--;

    }
    
    public void start(){
    
        System.out.println ("Odtwarzacz mp3 zaczyna odtwarzania muzyki");
        
    }
    
    public void stop(){
    
        System.out.println ("Odtwarzacz mp3 nie moze odtworzyc pliki muzyczne  ");
        
    }
    
    public void pauza(){
    
        System.out.println ("Odtwarzacz mp3 jest przerwany");
        
    }

    //metoda zwracajaca reprezentacje obiektu w formie lancucha tekstowego
    public String toString() {
    
        return "Odtwarzacz mp3  marki: " + marka + " jest " +
        ( czyDziala() ? "wlanczony" : "wylanczony") + " Pojemnosc: " +  pojemnosc + " gb  " + "Stan baterii: " + bateria + "%" + " GЕ‚oЕ›noЕ›Д‡ nagrania mp3: " + glosnosc ;
        
    }
    
}
public class UrzadzeniaMuzyczne {

    public static void main (String[] args) {


        // tworzymy obiekt klasy  OdtwarzaczMP3
        OdtwarzaczMP3 o1 = new OdtwarzaczMP3("Philips", 16, 89);

       // SprawdЕє poprawnosci dzialaania programu
        o1.wlacz();
        o1.start();
        o1.glosniej();

        System.out.println (o1);

        o1.pauza();
        o1.wylacz();
        o1.ciszej();
        System.out.println (o1);
        
    }

}
