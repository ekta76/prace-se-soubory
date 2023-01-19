import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PraceSeSoubory {
    public static final String ODDELOVAC = ":";
    public static List<Zakaznik> zaznamZakazniku = new ArrayList<>();
    public static void ctiZeSouboru(String s){
    String line = ODDELOVAC;
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("zakaznik.txt")));

            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] polozka = line.split(ODDELOVAC);
                int pocetProdeju = Integer.parseInt(polozka[1]);
                zaznamZakazniku.add(new Zakaznik(polozka[0], pocetProdeju));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nenalezen");
        }
    }

    public static void writeToFile(List<Zakaznik> zakaznici, String soubor, String oddelovac){
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("zakaznik.txt")));

            for(Zakaznik zakaznik : zakaznici){
                writer.println(zakaznik.getJmeno().trim() + oddelovac + zakaznik.getPocetProdeju());
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(
                    "Chyba při zápisu do souboru"
                            + soubor+": "+e.getLocalizedMessage());
        }
    }

}
