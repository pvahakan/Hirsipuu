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
        if (this.arvatutKirjaimet.indexOf(kirjain) == -1) {
            arvatutKirjaimet += kirjain;

            if (this.sana.indexOf(kirjain) == -1) {
                this.virheidenLukumaara += 1;
            }
        }

    }

    public String salattuSana() {
        // tulostaa esim KISS_
        return this.arvatutKirjaimet;
    }
}
