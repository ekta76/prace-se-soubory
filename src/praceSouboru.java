import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class praceSouboru {
    private final List<Zakaznik> zakaznici = new ArrayList<>();
    private List<Zakaznik> getZakaznici() {
        return zakaznici;
    }

    public static final String ODDELOVAC = ";";
    List<Zakaznik> zaznamZakazniku = new ArrayList<>();
    String line = ODDELOVAC;
    {
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

    public static void writeToFile(List<Zakaznik> zakaznici){
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("zakaznik.txt")));

            for(Zakaznik zakaznik : zakaznici){
                writer.write(zakaznik.getJmeno() + zakaznik.getPocetProdeju());
            }

        } catch (IOException e) {
            System.out.println("Zkontrolujte soubor");
        }
    }

}
