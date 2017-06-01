package com.practice.delta;

import java.util.Scanner;

public class RownanieKwadratowe{
	
	public static void main (String[] args) {
   
    double  a,b,c,delta;
	
    Scanner klawiatura = new Scanner(System.in);
    System.out.print("Wpisz a: ");
    a = klawiatura.nextDouble();
    System.out.print("Wpisz b: ");
    b = klawiatura.nextDouble();
    System.out.print("Wpisz c: ");
    c = klawiatura.nextDouble();
    
    delta = (b*b) - (4*a*c);
    delta = Math.sqrt(delta);
    
    if(delta<0){
    
      System.out.print("brak rezultatu");
    
    } else if(delta==0) {
    	
      double  x = -b / 2 * a;
    	System.out.print("x =" + x);
    
    } else if (delta>0) {
    	
    	double x = (-b - delta) /2 * a ;
    	double xx = (-b + delta) /2 * a;
    	System.out.print("x1 =" + x + " " + "x2 =" + xx);
    	   	
    }
    	
    }
    
    }
