package doprava;

public class Auto extends AbsProstredek {
    private int pocetValcu;

    Auto(String jmenoProstredku, float maxPalivo, int maxMist, int pocetValcu) {
        super(jmenoProstredku, maxPalivo, maxMist);
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
    public void zrychli(float x, float y, float z) {
        if(this.soucasnePalivo-((x+y+z))*this.pocetValcu>=0){
            this.souradniceX+=this.rychlostX+=x*this.pocetValcu;
            this.souradniceY+=this.rychlostY+=y*this.pocetValcu;
            if(z!=0){System.out.println("Upřímně. Co jsi čekal? Toto je auto. Auto neumí létat. Auto nedokáže jet pod zem. Jsme na rovné ploše. Už jen to, že jsi se pokusil o to, aby auto vzlétlo či vjelo pod zem je absolutně nepochopitelné. Zamysli se nad tím, co děláš.");}
        }
        else{
            System.out.println("Neni palivo.");
        }
    }

    @Override
    public float[] vypisStatus() {
        return new float[]{this.souradniceX,this.souradniceY,this.souradniceZ,this.rychlostX,this.rychlostY,this.rychlostZ};
    }

    @Override
    public float vypisPalivo() {
        return this.soucasnePalivo;
    }
}
