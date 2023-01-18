import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Zakaznik> zakaznici = new ArrayList<>();
        zakaznici.add(new Zakaznik("Karel Dvořák", 400));
        zakaznici.add(new Zakaznik("Josef Výmola", 46));

        zakaznici.remove(zakaznici.size() - 1);

        praceSouboru.writeToFile(zakaznici, "zakaznik.txt", ":");

        praceSouboru.nactiSoubor("zakaznik.txt");

    }

}