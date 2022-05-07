package pl.sda.arp4.console;

import java.util.Scanner;
// Stwórz nowego maina (MainIloscPowtorzen)
//Zapytaj uzytkownika o ilosc powtorzen
//Wczytaj wartosć ze scannera
//Stworz petle i N (ilosc powtorzen) razy wypisz na ekran "Hello World"

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        for (int i = 0; i < liczba; i ++) {  //bardzo czytelne ale na dwie linie kodu
//            System.out.println(i + "Hello World!"); // 0 Hello World!, 1....
            int numerIteracji = i +1;
            System.out.println(( i+ 1) + "Hello World"); //najbardziej naturalna, najcześciej stosowana

        }
    }
}
