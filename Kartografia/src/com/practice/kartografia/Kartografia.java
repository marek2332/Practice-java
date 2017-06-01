/* 
 Nazwa: Kartografia.java
 Autor: Markiian Danchyshyn
 
 Opis: Zadanie 97 Kartografia.java
 Program, ktory umozliwia przechowywanie informacji
 dotyczacych polozenia dowolnie wybranych miejscowosci oraz pozwala na wyznaczenie odleglsci,
 ktore je dzieli.
*/

package com.practice.kartografia;

import java.util.Scanner;

public class Kartografia {

    public static void main(String[] args) {

        // tworzenia obiektu klasy WspolrzedneGeograficzne 
        WspolrzedneGeograficzne informacja = new WspolrzedneGeograficzne();
        
        // wyswietlanie wspolrzednych 3 miast
        informacja.koordynaty();

        // odczytywanje danych z konsoli  Wpisz dane przy wykorzystaniu "," np.(54,069)
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz szerokosc 1 miasta: ");
        double szerokoscA = sc.nextDouble();
        System.out.print("Wpisz dlugosc 1 miasta: ");
        double dlugoscA = sc.nextDouble();
        System.out.print("Wpisz szerokosc 2 miasta: ");
        double szerokoscB = sc.nextDouble();
        System.out.print("Wpisz dlugosc 2 miasta: ");
        double dlugoscB = sc.nextDouble();


        // tworzenia obiektu klasy WspolrzedneGeograficzne
        WspolrzedneGeograficzne KrakowGdansk = new WspolrzedneGeograficzne();
        
        // obliczanie odleglosci
        KrakowGdansk.obliczOdleglosc(szerokoscA,  dlugoscA, szerokoscB, dlugoscB );




    }
}
