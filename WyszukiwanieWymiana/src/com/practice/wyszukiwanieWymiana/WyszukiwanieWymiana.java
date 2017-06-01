
/* 
 Nazwa: WyszukiwanieWymiana.java
 Autor: Markiian Danchyshyn

 Opis: Zadanie 88 – WyszukiwanieWymiana.java 
 Program odczytuje z konsoli 3 ciagi znakow, a nastepnie modyfikuje pierwszy z nich w nastepujacy
 sposob: wszystkie wystapienia drugiego ciagu sa zastepowane trzecim ciagiem.
*/

package com.practice.wyszukiwanieWymiana;

import java.util.Scanner;

// utworzenia klasy Znaki       
class Znaki {

    String ciag;
    
    // utworzenia metody scan ktora odczytuje dane z konsoli
    String scan() {   
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Wpisz ciag: ");
    ciag = sc.nextLine();
    return ciag;
    
    }
    
}
 
public class WyszukiwanieWymiana {

    public static void main(String[] args) {
    
      // tworzenia obiektow klasy Znaki
      Znaki Znak1=new Znaki(); 
      Znaki Znak2=new Znaki();
      Znaki Znak3=new Znaki();
      
      // wykorzystanie metody replaseALL dla zastapienia wszystkich wystepien 2 ciagu znakow 3 ciagem
      String wynik = Znak1.scan().replaceAll(Znak2.scan(),Znak3.scan());
      
    	// wyswietlenia rezultatow                                                  
      System.out.println("Wynik zastapienia: " + wynik); 
    
 
    }
    
}
