package pl.sda.arp4.console;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // wyjście programu
        System.out.println("Rozpoczynam działanie");

        //Pytamy o podanie imienia
        System.out.println("Podaj swoje imie");

        Scanner scanner = null;
        int zmiennaWiek = scanner.nextInt();
        int wiekDekady = zmiennaWiek / 10;


        // wejście programu
        scanner = new Scanner(System.in);

        // wczytanie od użytkownika jego imienia (jakiegokolwiek tekstu - 1 słowo/token)
        String zmiennaImie = scanner.next();

        // wypisanie imienia użytkownika (konkatenacja z komunikatem)
        System.out.println("Witaj " + zmiennaImie + "!");

        System.out.println("Żyjesz już" + wiekDekady == "dekad");

    }
}