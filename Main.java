package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc");
        int ilosc = scanner.nextInt();
        System.out.println("wybierz opcje 1,2,3... (waga,dlugosc,ojetosc)");
        int wybor = scanner.nextInt();
        System.out.println("podaj jednostke bazowa");
        String j1 = scanner.next();
        System.out.println("podaj jednostke na ktora chcsz zamienic435");
        String j2 = scanner.next();
        if(wybor==1){
            waga w = new waga();
            w.obliczenia(ilosc,j1,j2);
        }
    }
}
