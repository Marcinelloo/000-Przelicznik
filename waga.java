package com.company;

import java.util.Scanner;

public class waga {




    public void obliczenia(int ilosc, String j1, String j2){
        if(j1.equals("mg")&&j2.equals("g"))
        { double wynik = ilosc/1000;
            System.out.println(" "+wynik+" "+j2);}
        else if(j1.equals("mg")&&j2.equals("dag"))
        { double wynik = ilosc/10000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("mg")&&j2.equals("kg"))
        { double wynik = ilosc/1000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("mg")&&j2.equals("t"))
        { double wynik = ilosc/1000000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("g")&&j2.equals("mg"))
        { double wynik = ilosc*1000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("g")&&j2.equals("dag"))
        { double wynik = ilosc/10;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("g")&&j2.equals("kg"))
        { double wynik = ilosc/1000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("g")&&j2.equals("t"))
        { double wynik = ilosc/1000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("dag")&&j2.equals("mg"))
        { double wynik = ilosc*10000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("dag")&&j2.equals("g"))
        { double wynik = ilosc*10;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("dag")&&j2.equals("kg"))
        { double wynik = ilosc/100;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("dag")&&j2.equals("t"))
        { double wynik = ilosc/1000000;
            System.out.println(wynik+" "+j2);}
        if(j1.equals("kg")&&j2.equals("mg"))
        { double wynik = ilosc*1000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("kg")&&j2.equals("g"))
        { double wynik = ilosc*1000;
            System.out.println(wynik+" "+j2);}
        if(j1.equals("kg")&&j2.equals("dag"))
        { double wynik = ilosc*100;
            System.out.println(wynik+" "+j2);}
        if(j1.equals("kg")&&j2.equals("t"))
        { double wynik = ilosc/1000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("t")&&j2.equals("mg"))
        { double wynik = ilosc*1000000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("t")&&j2.equals("g"))
        { double wynik = ilosc*1000000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("t")&&j2.equals("dag"))
        { double wynik = ilosc*100000;
            System.out.println(wynik+" "+j2);}
        else if(j1.equals("t")&&j2.equals("kg"))
        { double wynik = ilosc*1000;
            System.out.println(wynik+" "+j2);}
    }}






