/*
 Zadanie 36 – PodatekDochodowy.java 
 autor: Mark Danchyshyn 
*/

package com.practice.podatekDochodowy;

import java.util.Scanner;

public class PodatekDochodowy{
	
	public static void main (String[] args) {
		
		// deklaracja zmiennej
		double dochod;
		
		//wprowadzenia danych do konsoli
		Scanner sc = new Scanner(System.in);
		System.out.print("Wpisz swoj dochod roczny: ");
		dochod = sc.nextDouble();
		
		// wykorzystanie pentli if else
		if(dochod <= 85528){
		
			//obliczanie podatku przy dochodzie ponizej 85528 zl		 	
        		double podatek = (dochod * 0.18) - 556.02;
        
       	 		//wyswietlenia wynikow
        		System.out.print("Podatek Dochodowy = " + podatek + "zl");
        
		} else{
			
			//obliczanie podatku przy dochodzie powyzej 85528 zl	
	    		double podatek = (((dochod - 85528) * 0.32) + (85528 * 0.18));
	    
	    		//wyswietlenia wynikow
        		System.out.print("Podatek Dochodowy = " + podatek + "zl");
			
		
		}	
    }
}
