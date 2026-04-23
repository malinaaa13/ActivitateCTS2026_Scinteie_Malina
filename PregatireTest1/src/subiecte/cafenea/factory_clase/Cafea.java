package subiecte.cafenea.factory_clase;

public class Cafea extends BauturaAbstract {
     Cafea(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    Cafea (Cafea sursa){
         super(sursa);
    }

    @Override
    public void preparare() {
        System.out.println("Pregarare "+ this.nume+ ":");
        System.out.println("Pasul1. Rasnire boabe cafea");
        System.out.println("Pasul2. Fierbere apa");
        System.out.println("Pasul3. Servire in ceasca de "+this.volum+" ml");
    }

    @Override
    public String getDetalii() {
        return "Bautura "+this.nume+" are "+this.volum+" ml si costa "+this.pret+ "RON";
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        System.out.println("S-a adaugat topping");
        this.pret+=5.0;
        return true;
    }

    @Override
    public IBautura copiaza() {
        return new Cafea(this);
    }

}
