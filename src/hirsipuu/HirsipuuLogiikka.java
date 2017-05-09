package hirsipuu;

public class HirsipuuLogiikka {

    private String sana;
    private String arvatutKirjaimet;
    private int virheidenLukumaara;

    public HirsipuuLogiikka(String sana) {
        this.sana = sana.toUpperCase();
        this.arvatutKirjaimet = "";
        this.virheidenLukumaara = 0;
    }

    public int virheidenLukumaara() {
        return this.virheidenLukumaara;
    }

    public String arvatutKirjaimet() {
        return this.arvatutKirjaimet;
    }

    public int virheitaHavioon() {
        return 12;
    }

    public void arvaaKirjain(String kirjain) {
        kirjain = kirjain.toUpperCase(); // iso kirjain

        // Tutkitaan, onko kirjainta vielä arvattu
        if (!this.arvatutKirjaimet.contains(kirjain)) {
            arvatutKirjaimet += kirjain;

            if (!this.sana.contains(kirjain)) {
                this.virheidenLukumaara += 1;
            }
        }

    }

    public String salattuSana() {
        String salattuSana = ""; // Palautettava merkkijono
        
        // Muodostetaan taulukko arvattavan sanan merkeistä
        char[] sanaTaulukko = this.sana.toCharArray();
        
        /* Tutkitaan merkki kerrallaan, onko arvattavassa sanassa oleva
        kirjain arvattujen kirjainten listalla. Huom. arvattava sana käydään
        järjestyksessä alusta lähtien läpi, jolloin merkkien lisäys 
        toimii. */
        
        for (char i : sanaTaulukko) {
            if (!this.arvatutKirjaimet.contains(i+"")) {
                salattuSana += '_';
            } else {
                salattuSana += i;
            }
        }
        if (!salattuSana.contains("_")) {
            System.out.println("Hienoa, arvasit sanan!");
        }
        return salattuSana;
    }

}
