package doprava;

public class Letadlo extends AbsProstredek {
    private int pocetMotoru;

    public Letadlo(String jmenoProstredku, float maxPalivo, int pocetMotoru, int maxMist, float palivoZaJednotku) {
        super(jmenoProstredku, maxPalivo, maxMist, palivoZaJednotku);
        this.pocetMotoru = pocetMotoru;
    }


    @Override
    public void opustit() {
        this.soucasneMist=0;
        System.out.println("Vsichni vystoupili z "+this.jmenoProstredku+".");
        if(souradniceZ!=0 && rychlostX!=0 && rychlostY!=0 && rychlostZ!=0){
            System.out.println("Vsichni zemreli.");
        }
    }

    public void opustit(int pocetLidi){
        if(0<=this.soucasneMist-pocetLidi){
            this.soucasneMist=this.soucasneMist-pocetLidi;
            System.out.println(pocetLidi+" vystoupilo z "+this.jmenoProstredku+".");
            System.out.println("V tomto prostredku prave je "+this.soucasneMist+" lidi.");
        }
        else{
            System.out.println("V "+this.jmenoProstredku+" ani tolik lidi neni! Je jich tam pouze "+pocetLidi+"!");
        }
        if(souradniceZ!=0 && rychlostX!=0 && rychlostY!=0 && rychlostZ!=0){
            System.out.println("Vsichni zemreli.");
        }
    }

    @Override
    public void vstoupit() {
        System.out.println("Kapacita "+this.jmenoProstredku+" je plne naplnena.");
        if(souradniceZ!=0 && rychlostX!=0 && rychlostY!=0 && rychlostZ!=0) {
            System.out.println("Nikdo ale vlastne nenastoupil.");
        }
        else {
            this.soucasneMist = this.maxMist;
        }
    }

    public void vstoupit(int pocetLidi) {
        if (this.maxMist <= this.soucasneMist + pocetLidi) {
            System.out.println(pocetLidi + " vstoupilo do " + this.jmenoProstredku + ".");
            if(souradniceZ!=0 && rychlostX!=0 && rychlostY!=0 && rychlostZ!=0){
                System.out.println("Nikdo ale vlaste nenastoupil.");
            }
            else{
                this.soucasneMist = this.soucasneMist + pocetLidi;
            }
            System.out.println("V tomto prostredku prave je " + this.soucasneMist + " lidi.");
        }
        else{
            System.out.println("V " + this.jmenoProstredku + " ani tolik volnych mist neni! Je jich tam pouze " + (this.maxMist - this.soucasneMist) + "!");
        }
    }

    @Override
    public void doplnitPalivo() {

    }

    @Override
    public void akcelerujDopredu() {

    }

    @Override
    public void akcelerujDozadu() {

    }

    @Override
    public void akcelerujDoleva() {

    }

    @Override
    public void akcelerujDoprava() {

    }

    @Override
    public void akcelerujNahoru() {

    }

    @Override
    public void akcelerujDolu() {

    }

    /**
     * Sem dej tela tech funkci z IStatusVozidla
     */
}
