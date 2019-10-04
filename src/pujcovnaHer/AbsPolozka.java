package pujcovnaHer;

public abstract class AbsPolozka {

    private String jmeno;
    private String cena;
    private boolean pujceno;
    private String jmenoPujcitele;

    public AbsPolozka(){
        this.jmeno=jmeno;
        this.cena=cena;
        this.pujceno=pujceno;
        this.jmenoPujcitele=jmenoPujcitele;
    }

    public abstract void pujcit();
    public abstract void vratit();
    public abstract void vytvorit();
    public abstract void znicit();

}
