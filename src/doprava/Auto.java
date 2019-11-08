package doprava;

public class Auto extends AbsProstredek {
    private int pocetValcu;

    public Auto(String jmenoProstredku, float maxPalivo, int maxMist, float palivoZaJednotku, int pocetValcu) {
        super(jmenoProstredku, maxPalivo, maxMist, palivoZaJednotku);
        this.pocetValcu = pocetValcu;
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
        if(rychlostX!=0 && rychlostY!=0){
            System.out.println("Vsichni co vystoupili zemreli.");
        }
    }

    @Override
    public void vstoupit() {
        System.out.println("Kapacita "+this.jmenoProstredku+" je plne naplnena.");
        if(rychlostX!=0 && rychlostY!=0) {
            System.out.println("Nikdo ale vlastne nenastoupil.");
        }
        else {
            this.soucasneMist = this.maxMist;
        }
    }

    public void vstoupit(int pocetLidi) {
        if(this.maxMist <= this.soucasneMist + pocetLidi) {
            System.out.println(pocetLidi + " vstoupilo do " + this.jmenoProstredku + ".");
            if(rychlostX!=0 && rychlostY!=0){
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
        System.out.println("Jak?");
    }

    @Override
    public void akcelerujDolu(float oKolik) {
        System.out.println("Jak?");
    }

    @Override
    public void pohniSe() {
        this.souradniceX+=this.rychlostX;
        this.souradniceY+=this.rychlostY;
    }

    @Override
    public float[] vypisStatus() {
        float[] returnable = {this.souradniceX,this.souradniceY,this.souradniceZ,this.rychlostX,this.rychlostY,this.rychlostZ};
        return returnable;
    }
}
