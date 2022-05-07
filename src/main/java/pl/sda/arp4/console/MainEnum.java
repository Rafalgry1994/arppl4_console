package pl.sda.arp4.console;

import java.util.Scanner;

import static pl.sda.arp4.console.StanCywilny.ZAJETY;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój stan cywilny");

        System.out.println("Podaj swój stan cywilny: ");
        String stanCywilny = scanner.next();

        // Deklaracja przed if'em
        StanCywilny zmiennaStanCywilny;

        // Przypisujemy wartość na podstawie wpisanego tekstu
        if (stanCywilny.equals("ZAJETY")) {
            zmiennaStanCywilny = ZAJETY;
        } else {
            zmiennaStanCywilny = StanCywilny.WOLNY;
            zmiennaStanCywilny = StanCywilny.NIEZNANY;
            System.out.println("Nic nie pasuje");
        }

        // mogę skorzystać ze zmiennej którą zadeklarowałem przed if
        System.out.println(zmiennaStanCywilny);

        switch (zmiennaStanCywilny){
            case ZAJETY:  // else if (zmiannaStanCywilny == WOLNY)
                System.out.println("To jest wolny ziomek");
                break;
            case WOLNY:  // else if (zmiennaStanCywilny == ZAJETY)
                System.out.println("Ten typ jest zajęty");
                break;
            default:    // else (NIEZNANY)
                System.out.println("Ani wolny, ani zajety");




        }



    }
}
