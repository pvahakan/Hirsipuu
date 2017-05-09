package hirsipuu;

import java.util.Scanner;

public class Hirsipuu {

    public static void main(String[] args) {

        HirsipuuLogiikka hirsipuu = new HirsipuuLogiikka("aavasaksanvaara");
        Scanner scan = new Scanner(System.in);

        System.out.println(hirsipuu.salattuSana());

        while (!hirsipuu.arvattu) {
            System.out.print("Arvaa kirjain: ");
            String kirjain = scan.next();
            while (kirjain.length() != 1) {
                System.out.print("Arvaa kirjain: ");
                kirjain = scan.next();
            }

            hirsipuu.arvaaKirjain(kirjain);
            System.out.println(hirsipuu.arvatutKirjaimet());
            if (hirsipuu.virheitaHavioon() == 0) {
                System.out.println("Hävisit pelin.");
                break;
            } else {
                System.out.println(hirsipuu.salattuSana());
            }
        }

    }

}
