package hirsipuu;

public class Hirsipuu {

    public static void main(String[] args) {

        HirsipuuLogiikka log = new HirsipuuLogiikka("Kissa");

        log.arvaaKirjain("A");
        log.arvaaKirjain("d"); // virhe
        log.arvaaKirjain("s");
        log.arvaaKirjain("f"); // virhe
        log.arvaaKirjain("d"); // virhe

        System.out.println("Arvatut kirjaimet: " + log.arvatutKirjaimet());
        System.out.println("Virheiden lukumäärä: " + log.virheidenLukumaara());
    }

}
