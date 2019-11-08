package doprava;

public class Vyrobna {
    public AbsProstredek vytvorProstredek(String typ, String jmenoProstredku, float maxPalivo, int maxMist, float palivoZaJednotku, int pocetPohonu ){
        if (typ=="Auto"){
            return new Auto(jmenoProstredku, maxPalivo, maxMist, palivoZaJednotku, pocetPohonu);
        }
        else if (typ=="Letadlo"){
            return new Letadlo(jmenoProstredku,maxPalivo,pocetPohonu,maxMist,palivoZaJednotku);
        }
        return new Ponorka(jmenoProstredku,maxPalivo,maxMist,palivoZaJednotku,pocetPohonu);
    }
}
