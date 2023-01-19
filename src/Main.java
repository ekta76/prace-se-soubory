
public class Main {
    public static void main(String[] args) {

        PraceSeSoubory.zaznamZakazniku.add(new Zakaznik("Karel Dvořák", 400));
        PraceSeSoubory.zaznamZakazniku.add(new Zakaznik("Josef Výmola", 46));

        PraceSeSoubory.zaznamZakazniku.remove(PraceSeSoubory.zaznamZakazniku.size() - 1);

        PraceSeSoubory.writeToFile(PraceSeSoubory.zaznamZakazniku, "zakaznik.txt", ":");

        PraceSeSoubory.nactiSoubor("zakaznik.txt");

    }

}