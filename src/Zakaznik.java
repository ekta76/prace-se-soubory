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

    public void zvysPocetProdeju(int pocetProdeju){
        if(pocetProdeju < 0){
            System.out.println("Neplatné číslo - číslo musí být kladné");
            return;
        }
        this.pocetProdeju += pocetProdeju;
    }

    @Override
    public String toString() {
        return jmeno + pocetProdeju;
    }
}
