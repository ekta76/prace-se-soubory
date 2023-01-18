import java.util.ArrayList;
import java.util.List;

public class EvidenceZakazniku {
    private final List<Zakaznik> seznamZakazniku = new ArrayList<>();

    public List<Zakaznik> getZakazniky() {
        return seznamZakazniku;
    }
    public void addZakaznika(Zakaznik zakaznik){
        seznamZakazniku.add(zakaznik);
    }
    public void removePosledniho(){
        seznamZakazniku.remove(seznamZakazniku.size() - 1);
    }
}
