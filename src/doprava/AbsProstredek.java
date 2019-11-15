package doprava;

public abstract class AbsProstredek implements IOpustitVstoupit, IPalivo, IRidit, IStatusVozidla {
    protected String jmenoProstredku;
    protected int maxMist;
    protected int soucasneMist;
    protected float maxPalivo;
    protected float soucasnePalivo;
    protected float souradniceX;
    protected float souradniceY;
    protected float souradniceZ;
    protected float rychlostX;
    protected float rychlostY;
    protected float rychlostZ;

    public AbsProstredek(String jmenoProstredku, float maxPalivo, int maxMist) {
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
