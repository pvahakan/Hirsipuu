package hirsipuu;

public class Hirsipuu {

    public static void main(String[] args) {

        HirsipuuLogiikka log = new HirsipuuLogiikka("Kissa");
        System.out.println(log.salattuSana());
        
        log.arvaaKirjain("A");
        System.out.println(log.salattuSana());
        log.arvaaKirjain("d"); // virhe
        System.out.println(log.salattuSana());
        log.arvaaKirjain("s");
        System.out.println(log.salattuSana());
        log.arvaaKirjain("f"); // virhe
        System.out.println(log.salattuSana());
        log.arvaaKirjain("k"); 
        System.out.println(log.salattuSana());
        log.arvaaKirjain("i");
        System.out.println(log.salattuSana());
        
                
        System.out.println("Arvatut kirjaimet: " + log.arvatutKirjaimet());
        System.out.println("Virheiden lukumäärä: " + log.virheidenLukumaara());

    }

}
