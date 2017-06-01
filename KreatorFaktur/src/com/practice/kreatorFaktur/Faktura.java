/* 
 Nazwa: KreatorFakturVAT.java
 Autor: Markiian Danchyshyn
 
 Opis: program, ktory realizuje usprawniajace wystawianie faktur VAT.
*/

package com.practice.kreatorFaktur;

public class Faktura {

  // deklaracja zmiennych
  public static int numerFaktury = 12334;
  public static String dataSprzedazy = "12-04-2016";
  public static String nazwaSprzedawcy = "Firma BOMI";
  public static String adresSprzedawcy = "Os. Oswiecenia 27/47";
  public static String kodpocztowySprzedawcy = "31-636";
  public static String miejscowoЕ›Д‡Sprzedawcy = "Krakow";
  public static String nipSprzedawcy = "955-80-06-199";
  public static String nazwaNabywcy = "Firma Handlowa ADMAR";
  public static String adresNabywcy = "ul. Ojcowska 174 B";
  public static String kodpocztowyNabywcy = "31-344";
  public static String miejscowoЕ›Д‡Nabywcy = "KrakГіw";
  public static String nipNabywcy = "945-15-17-017";
  public Towar t1;
  public Usluga u1;

  // konstruktor 1
  public Faktura(Towar t1) {
    this.t1 = t1;

 }
 
 // konstruktor 2
 public Faktura(Usluga u1) {
    this.u1 = u1;

 }

 // metoda Main
 public static void main(String[] args) {

    // tworzenia obiektu klasy Faktura
    Faktura f1 = new Faktura(new Towar("Piasek budowlany", "kg", 25, 0.29, 6.02, 22, 7.35 ));
    Faktura f2 = new Faktura(new Usluga("MontaЕј wanny", "godz.",  2, 65, 130, 7, 140));

    // wyswietlenia informacji
    System.out.println("FAKTURA VAT nr " + numerFaktury);
    System.out.println("Data Sprzedazy " + dataSprzedazy);
    System.out.println("");
    System.out.println("SPRZEDAWCA: " );
    System.out.println( nazwaSprzedawcy );
    System.out.println(adresSprzedawcy + ", " + kodpocztowySprzedawcy + ", " + miejscowoЕ›Д‡Sprzedawcy );
    System.out.println("NIP " + nipSprzedawcy );
    System.out.println("");
    System.out.println("NABYWCA: " );
    System.out.println( nazwaNabywcy );
    System.out.println(adresNabywcy + ", " + kodpocztowyNabywcy + ", " + miejscowoЕ›Д‡Nabywcy );
    System.out.println("NIP " + nipNabywcy );
    System.out.println("");
    System.out.println("");

    // wyswietlenia tablicy
    System.out.println("| Nazwa towaru/usЕ‚ugi | j.m. | cena | iloЕ›Д‡ | wart.netto | st.VAT | wart.brutto|");
    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("| " + f1.t1.Nazwa() + "    | " + f1.t1.PobierzjednostkaMiary() + "   | " + f1.t1.PobierzcenajednostkowaNetto() +  " | " + f1.t1.Pobierzilosc() + "    | " + f1.t1.PobierzwartoscNetto() + "       | " + f1.t1.PobierzstawkaVAT() + "     | " + f1.t1.PobierzwartoscBrutto() + "       |");
    System.out.println("| " + f2.u1.Nazwa() + "        | " + f2.u1.PobierzjednostkaMiary() + "| " + f2.u1.PobierzcenaRoboczogodzin() +  "   | " + f2.u1.PobierzliczbaRoboczogodzin() + "     | " + f2.u1.PobierzwartoscNetto() + "      | " + f2.u1.PobierzstawkaVAT() + "      | " + f2.u1.PobierzwartoscBrutto() + "      |");
    System.out.println("--------------------------------------------------------------------------------");
    double sumaBrutto =  f1.t1.PobierzwartoscBrutto() + f2.u1.PobierzwartoscBrutto();
    System.out.println("Razem do zapЕ‚aty " + sumaBrutto );
    
 }
 
}

