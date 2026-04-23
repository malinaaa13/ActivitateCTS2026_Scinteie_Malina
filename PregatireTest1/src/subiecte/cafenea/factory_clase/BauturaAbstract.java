package subiecte.cafenea.factory_clase;

public abstract class BauturaAbstract implements IBautura {
    protected String nume;
    protected int volum;
    protected double pret;

    BauturaAbstract(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    protected BauturaAbstract (BauturaAbstract sursa){
        this.nume = sursa.nume;
        this.pret = sursa.pret;
        this.volum = sursa.volum;
    }
}
