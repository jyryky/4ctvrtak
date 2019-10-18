package pujcovnaHer;

public class Platformer extends AbsPolozka {

    private String jmeno;
    private int cena;
    private boolean pujceno;
    private String jmenoPujcitele;
    private String vyvojar;

    public Platformer(String jmeno, int cena, boolean pujceno, String jmenoPujcitele, String vyvojar) {
        this.jmeno = jmeno;
        this.cena = cena;
        this.pujceno = pujceno;
        this.jmenoPujcitele = jmenoPujcitele;
        this.vyvojar = vyvojar;
    }

    public void pujcit(){}
    public void vratit(){}
    public void vytvorit(){}
    public void znicit(){}
    public void zmenitCenu(){}
}
