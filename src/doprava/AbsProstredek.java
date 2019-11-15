package doprava;

public abstract class AbsProstredek implements IOpustitVstoupit, IPalivo, IRidit, IStatusVozidla {
    String jmenoProstredku;
    int maxMist;
    int soucasneMist;
    float maxPalivo;
    float soucasnePalivo;
    float souradniceX;
    float souradniceY;
    float souradniceZ;
    float rychlostX;
    float rychlostY;
    float rychlostZ;

    AbsProstredek(String jmenoProstredku, float maxPalivo, int maxMist) {
        this.jmenoProstredku = jmenoProstredku;
        this.maxPalivo = maxPalivo;
        this.maxMist = maxMist;
        this.soucasnePalivo = 0;
        this.soucasneMist = 0;
        this.souradniceX = 0;
        this.souradniceY = 0;
        this.souradniceZ = 0;
        this.rychlostX = 0;
        this.rychlostY = 0;
        this.rychlostZ = 0;
    }
}
