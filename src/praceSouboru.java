import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class praceSouboru {
    public static final String ODDELOVAC = ":";
    static List<Zakaznik> zaznamZakazniku = new ArrayList<>();
    public static void nactiSoubor(String s){
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

    public static void writeToFile(List<Zakaznik> zakaznici, String s, String[] split){
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