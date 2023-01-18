import java.util.ArrayList;
import java.util.List;

public class EvidenceZakazniku {
    private final List<Zakaznik> zaznamZakazniku = new ArrayList<>();

    public List<Zakaznik> getZakazniky() {
        return zaznamZakazniku;
    }
    public void addZakaznika(Zakaznik zakaznik){
        zaznamZakazniku.add(zakaznik);
    }
    public void removePosledniho(){
        zaznamZakazniku.remove(zaznamZakazniku.size() - 1);
    }
}
