/*
 Zadanie 29 - FormatRachunku.java
 autor: Mark Danchyshyn
*/

package com.practice.formatRachunku;

import java.util.Scanner;



public class FormatRachunku{
	public static void main (String[] args) {
    
    // deklaracja zmiennej
    String   NrRachunku;

    //wprowadzenia danych
    Scanner klawiatura = new Scanner(System.in);
    
    System.out.print("Wpisz 26-elementowy numer bankowy: ");
    
    NrRachunku = klawiatura.nextLine();
    
    //wykorzystania metody substring(int beginIndex, int endIndex), ktora rozbija NrRachunku na czesci 
    String a = NrRachunku.substring(0, 2);
    String b = NrRachunku.substring(3, 7);
    String c = NrRachunku.substring(8, 12);
    String d = NrRachunku.substring(13, 17);
    String e = NrRachunku.substring(18, 22);
    String f = NrRachunku.substring(23, 26);
   
    //wyswietlenia poszczegolnyh elemetow z odstepami   
    System.out.print(a + " " + b + " " + c + " " + d + " " + e + " " + f);
       
   
  	
    }
} 
