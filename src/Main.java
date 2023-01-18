import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String ODDELOVAC = ":";
    public static void main(String[] args) {
        String line = "";

        List<Zakaznik> zakaznici = new ArrayList<>();
        zakaznici.add(new Zakaznik("Karel Dvořák", 400));
        zakaznici.add(new Zakaznik("Josef Výmola", 46));

        zakaznici.remove(zakaznici.size() - 1);

        praceSouboru.writeToFile(zakaznici, "zakaznik.txt", line.split(ODDELOVAC));

        praceSouboru.nactiSoubor("zakaznik.txt");

    }
}