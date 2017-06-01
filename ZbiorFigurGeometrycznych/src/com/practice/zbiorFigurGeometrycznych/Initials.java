/*
 Zadanie ZbiorFigurGeometrycznych.java
 Opis: Aplet zawierajacy
 figury geometryczne (kwadrat, prostokat oraz okrag) o wymiarach okreslonych przez wartoЕsci
 podanych zmiennych a = 20 b = 40 r = 30
 Autor: Mark Danchyshyn
*/
 
package com.practice.zbiorFigurGeometrycznych;

// klasy do tworzenia apletow
import java.applet.*;

// klasy do projektowania aplikacji
import java.awt.*;

public class Initials extends Applet {
    // deklaracja zmiennych
    int a1, b1, r1;

    public void start(){
    
      // tworzenia obiektu klasy String 
      String param = new String();
      
      // pobieranie parametrow z pliku Applet.html
      param = getParameter("A");
      a1 = Integer.parseInt(param);
      param = getParameter("B");
      b1 = Integer.parseInt(param);
      param = getParameter("R");
      r1 = Integer.parseInt(param);



    }
    
    public void init(){
    
        setBackground(Color.cyan);

    }

    // metoda umozliwiajaca rysowanie elementow graficznych
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.drawRect(30, 50, a1, a1);
        g.drawRect(90, 50, b1, a1);
        g.drawOval(150, 40, r1, r1);

    }

}



