package pujcovnaHer;

public abstract class AbsPolozka {

    private String jmeno;
    private int cena;
    private boolean pujceno;
    private String jmenoPujcitele;
    private String vyvojar;

    public AbsPolozka(){
        this.jmeno=jmeno;
        this.cena=cena;
        this.pujceno=pujceno;
        this.jmenoPujcitele=jmenoPujcitele;
        this.vyvojar=vyvojar;
    }

    public abstract void pujcit();
    public abstract void vratit();
    public abstract void vytvorit();
    public abstract void znicit();
    public abstract void zmenitCenu();

}
