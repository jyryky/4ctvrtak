package doprava;

import java.util.ArrayList;
import java.util.Objects;
import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import java.util.Arrays;

public class Vyrobna {

    private ArrayList<AbsProstredek> prostredky = new ArrayList<>();


    public void vytvorProstredek(String typ, String jmenoProstredku, float maxPalivo, int maxMist, int pocetPohonu ) {
        if (jeJmenoVolne(jmenoProstredku)) {
            if (Objects.equals(typ, "Auto")) {
                prostredky.add(new Auto(jmenoProstredku, maxPalivo, maxMist, pocetPohonu));
            } else if (Objects.equals(typ, "Letadlo")) {
                prostredky.add(new Letadlo(jmenoProstredku, maxPalivo, maxMist, pocetPohonu));
            } else {
                prostredky.add(new Ponorka(jmenoProstredku, maxPalivo, maxMist, pocetPohonu));
            }
        }
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
    /* public void ulozProstredekDoSouboru(String typ, String jmenoProstredku, float maxPalivo, int maxMist, int pocetPohonu){
    String fileName="Prostredky1.txt";
    ArrayList<AbsProstredek> em = new ArrayList<>();
    ArrayList<AbsProstredek> emNew = new ArrayList<>();
        em.add(prostredky); //P L S  F I X N I  T O  S L Í B I L  J S I  T O  J I R K O
        em.add(new Auto("Skoda octavia", 102, 5,0.2f,8));
        em.add(new Ponorka("Takovata co meli beetles", 500, 9,1,4));
    //serialize to file
        try {
        SerializationUtil.serialize(em, fileName);
    } catch (IOException e) {
        e.printStackTrace();
        return;
    }

    //deserialize from file
        try {
        emNew = SerializationUtil.deserialize(fileName);
    } catch (ClassNotFoundException | IOException e) {
        e.printStackTrace();
    }

        System.out.println("emp Object::"+em.get(0));
        System.out.println("emp Object::"+em.get(1));
        System.out.println("empNew Object::"+emNew.get(0));
        System.out.println("empNew Object::"+emNew.get(1));

}*/

    private boolean jeJmenoVolne(String jmenoProstredku){
        if(prostredky!=null){
            for (AbsProstredek prostredek:prostredky
                ) {
                if (Objects.equals(prostredek.jmenoProstredku, jmenoProstredku)){
                    return false;
                }
            }
        }
        return true;

    }
    public ArrayList<AbsProstredek> getProstredky() {
        return prostredky;
    }
}
