package com.practice.kartografia;

// utworzenia klasy WspolrzedneGeograficzne
public class WspolrzedneGeograficzne {

      // deklaracja zmiennych
      private double szerokosc1;
      private double dlugosc1;
      private double szerokosc2;
      private double dlugosc2;
      private double szerokoscGdansk = 54.360;
      private double dlugostGdansk = 18.639;
      private double szerokoscSlupsk = 54.470;
      private double dlugostSlupsk = 17.019;
      private double szerokoscKrakow = 50.060;
      private double dlugoscKrakow = 19.959;

      // statyczna metoda ktora liczy odleglosc
      public static void obliczOdleglosc(double szerokosc1, double dlugosc1, double szerokosc2, double dlugosc2) {

        double szerokosc1Radiance = Math.toRadians(szerokosc1);
        double odlegloscKm = Math.sqrt(((szerokosc2 - szerokosc1) * (szerokosc2 - szerokosc1)) + ((Math.cos(szerokosc1Radiance) * (dlugosc2 - dlugosc1)) * (Math.cos(szerokosc1Radiance) * (dlugosc2 - dlugosc1)))) * (40075.704 / 360);
        
        double odlegloscStopni = Math.toDegrees(odlegloscKm / 111.195) ;
        double odlegloscMinuty = odlegloscStopni * 60;        
        double odlegloscSekundy = odlegloscMinuty * 60;
        System.out.println("Odleglosc w Km = " + odlegloscKm + " Km");
        System.out.println("Odleglosc w Stopniach = " + odlegloscStopni + "В°");
        System.out.println("Odleglosc w Minutach = " + odlegloscMinuty);
        System.out.println("Odleglosc w Secundach = " + odlegloscSekundy);
   }
   
     
     public void koordynaty() {
     
       System.out.println("Gdansk: " + szerokoscGdansk + " N " + dlugostGdansk + " E");
       System.out.println("Slupsk: " + szerokoscSlupsk + " N " + dlugostSlupsk + " E");
       System.out.println("Krakow: " + szerokoscKrakow + " N " + dlugoscKrakow + " E");

       }




}
