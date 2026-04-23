package subiecte.cafenea.factory_clase;

public class Ceai extends BauturaAbstract {
     Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    Ceai (Ceai sursa){
         super(sursa);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare "+this.nume);
        System.out.println("Pas1. Fierbe apa");
        System.out.println("Pas2. Pune pliculetul de ceai");
        System.out.println("Pas3. Toarna bautura in recipientul de "+volum+" ml");
    }

    @Override
    public String getDetalii() {
        return "Bautura "+this.nume+" are "+this.volum+ " ml si costa "+this.pret+" RON";
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        System.out.println("Ceai nu are optiunea de topping");
        return false;
    }

    @Override
    public IBautura copiaza() {
        return new Ceai(this);
    }
}
