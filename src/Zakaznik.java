
public class Zakaznik {
    private String jmeno;
    private int pocetProdeju;

    public Zakaznik(String jmeno, int pocetProdeju) {
        this.jmeno = jmeno;
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public void zvysPocetProdeju(int pocet) throws ZException {
        if(pocet < 0){
            throw new ZException("Neplatné číslo - číslo musí být kladné: " + pocet + "!");
        }
        this.pocetProdeju += pocet;
    }

    @Override
    public String toString() {
        return jmeno.trim() + pocetProdeju;
    }
}
