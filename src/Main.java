public class Main {

    public static void main(String[] args) {

        EvidenceZakazniku evidenceZakazniku = new EvidenceZakazniku();

        evidenceZakazniku.addZakaznika(new Zakaznik("Karel Dvořák", 400));
        evidenceZakazniku.addZakaznika(new Zakaznik("Josef Výmola", 46));

        evidenceZakazniku.removePosledniho();

        praceSouboru.writeToFile(evidenceZakazniku.getZakazniky());


    }
}