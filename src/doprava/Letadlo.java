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
        if(this.maxMist <= this.soucasneMist + pocetLidi) {
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
        this.soucasnePalivo=this.maxPalivo;
        System.out.println("Palivo prostredku "+this.jmenoProstredku+" bylo doplneno.");
    }

    @Override
    public void pohniSe(){
        this.souradniceX+=this.rychlostX;
        this.souradniceY+=this.rychlostY;
        if(souradniceZ>=0){this.souradniceZ+=this.rychlostZ;}
        else{System.out.println("Letadlo je pod zemi!!");
            this.souradniceZ=0;
            this.souradniceX=0;
            this.souradniceY=0;
            this.rychlostX=0;
            this.rychlostY=0;
            this.rychlostZ=0;
        }
    }

    @Override
    public void akcelerujDopredu(float oKolik) {
        if(oKolik<0){akcelerujDozadu(0-oKolik);}
        else{
            this.rychlostY+=oKolik;
            pohniSe();
        }
    }

    @Override
    public void akcelerujDozadu(float oKolik) {
        if(oKolik<0){akcelerujDopredu(0-oKolik);}
        else{
            this.rychlostY-=oKolik;
            pohniSe();
        }
    }

    @Override
    public void akcelerujDoleva(float oKolik) {
        if(oKolik<0){akcelerujDoprava(0-oKolik);}
        else {
            this.rychlostX -= oKolik;
            pohniSe();
        }
    }

    @Override
    public void akcelerujDoprava(float oKolik) {
        if(oKolik<0){akcelerujDoleva(0-oKolik);}
        else{
            this.rychlostX+=oKolik;
            pohniSe();
        }
    }

    @Override
    public void akcelerujNahoru(float oKolik) {
        if(oKolik<0){akcelerujDolu(0-oKolik);}
        else{
            this.rychlostZ+=oKolik;
            pohniSe();
        }
    }

    @Override
    public void akcelerujDolu(float oKolik) {
        if(oKolik<0){akcelerujNahoru(0-oKolik);}
        else{
            this.rychlostZ-=oKolik;
            pohniSe();
        }
    }

    /**
     * Sem dej tela tech funkci z IStatusVozidla
     */
}
