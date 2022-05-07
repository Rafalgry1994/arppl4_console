package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPorównajImie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Podaj sowje imie");
String imie = scanner.next();

if (imie == "Marian") {
    System.out.println("Siema kolego! Dawno sie nie widzieliśmy");
} else {
    System.out.println("Witaj" + imie + "!");
}
    }
}
