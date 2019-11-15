package doprava;

import java.util.ArrayList;
import java.util.Objects;

public class Vyrobna {
    private ArrayList<AbsProstredek> prostredky = new ArrayList<>();

    public void vytvorProstredek(String typ, String jmenoProstredku, float maxPalivo, int maxMist, int pocetPohonu ){
        if (Objects.equals(typ, "Auto")){
            prostredky.add(new Auto(jmenoProstredku, maxPalivo, maxMist, pocetPohonu));
        }
        else if (Objects.equals(typ, "Letadlo")){
            prostredky.add(new Letadlo(jmenoProstredku,maxPalivo,maxMist,pocetPohonu));
        }
        prostredky.add(new Ponorka(jmenoProstredku,maxPalivo,maxMist,pocetPohonu));
    }

    public void znicProstredek(String jmenoProstredku){
        int i = 0;
        for (AbsProstredek prostredek: prostredky
             ) {
            if(Objects.equals(prostredek.jmenoProstredku, jmenoProstredku)){
                prostredky.remove(i);
            }
            i++;
        }
    }

    public ArrayList<AbsProstredek> getProstredky() {
        return prostredky;
    }
}
