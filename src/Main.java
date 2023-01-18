import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Zakaznik> zakaznici = new ArrayList<>();
        PraceSeSoubory.zaznamZakazniku.add(new Zakaznik("Karel Dvořák", 400));
        PraceSeSoubory.zaznamZakazniku.add(new Zakaznik("Josef Výmola", 46));

        PraceSeSoubory.zaznamZakazniku.remove(zakaznici.size() - 1);

        PraceSeSoubory.writeToFile(zakaznici, "zakaznik.txt", ":");

        PraceSeSoubory.nactiSoubor("zakaznik.txt");

    }

}