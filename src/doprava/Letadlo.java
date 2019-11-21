package doprava;


public class Letadlo extends AbsProstredek {
    private int pocetMotoru;

    public Letadlo(String jmenoProstredku, float maxPalivo, int maxMist, int pocetMotoru) {
        super(jmenoProstredku, maxPalivo, maxMist);
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
            this.soucasneMist=0;
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
    }

    @Override
    public void zrychli(float x, float y, float z){
        if(this.soucasnePalivo-((x+y+z))*this.pocetMotoru>=0){
            this.souradniceX+=this.rychlostX+=x*this.pocetMotoru;
            this.souradniceY+=this.rychlostY+=y*this.pocetMotoru;
            if(souradniceZ>=0){this.souradniceZ+=this.rychlostZ+=z*this.pocetMotoru;}
            else {
                System.out.println("Letadlo je pod zemi!!");
                this.souradniceZ = 0;
                this.rychlostX = 0;
                this.rychlostY = 0;
                this.rychlostZ = 0;
            }
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

    @Override
    public String getNazevProstredku() {
        return this.jmenoProstredku;
    }


}
