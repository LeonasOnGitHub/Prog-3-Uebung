package brueche;

public class Bruch implements Comparable<Bruch> {

    private int nenner;
    private int zaehler;
    private int ganzZahl;

    public Bruch(int zaehler, int nenner) throws IllegalArgumentException{
        if (nenner==0){
            throw new IllegalArgumentException();
        }
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public Bruch(int ganzZahl) {
        this.ganzZahl = ganzZahl;
    }

    public String toString() {
        return this.zaehler + "/" + this.nenner;
    }

    public Bruch multiplizieren(Bruch b) throws IllegalArgumentException{
        if (b.nenner==0){
            throw new IllegalArgumentException();
        }
        Bruch ergebnis = new Bruch(0, 0);
        ergebnis.nenner = this.nenner * b.nenner;
        ergebnis.zaehler = this.zaehler * b.zaehler;
        return ergebnis;
    }

    public double ausrechnen() {
        return this.zaehler / this.nenner;
    }

    public Bruch kehrwert() {
        Bruch ergebnis = new Bruch(0, 0);
        ergebnis.nenner = this.nenner * this.zaehler;
        ergebnis.zaehler = this.zaehler * this.nenner;
        return ergebnis;
    }

    public Bruch dividieren(Bruch b) throws IllegalArgumentException{
        Bruch ergebnis = new Bruch(0, 0);
        ergebnis.nenner = multiplizieren(kehrwert()).nenner * b.nenner;
        ergebnis.zaehler = multiplizieren(kehrwert()).zaehler * b.zaehler;
        return ergebnis;
    }

    public int getGanzZahl() {
        return ganzZahl;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    @Override
    public int compareTo(Bruch o) {
        if ( this.ausrechnen() < o.ausrechnen() ){
            return -1;
        }
        if ( this.ausrechnen() > o.ausrechnen() ){
            return 1;
        }
        return 0;
    }
}
