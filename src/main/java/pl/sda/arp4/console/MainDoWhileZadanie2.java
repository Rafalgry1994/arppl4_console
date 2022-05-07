package pl.sda.arp4.console;

// Napisz program, który wypisuje "Hello World" dopóki użytkownik podaje liczby większe od 0.

import java.util.Scanner;

public class MainDoWhileZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        // deklaracja przed petlą
        int liczba;


        do {
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();

            System.out.println("Hello World");
        } while (liczba > 0);
    }
}
