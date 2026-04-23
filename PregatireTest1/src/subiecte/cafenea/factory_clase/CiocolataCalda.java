package subiecte.cafenea.factory_clase;

public class CiocolataCalda extends BauturaAbstract {
     CiocolataCalda(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    CiocolataCalda (CiocolataCalda sursa){
         super(sursa);
    }

    @Override
    public void preparare() {
        System.out.println("Pregarare "+this.nume);
        System.out.println("Pas1. Incalzim laptele");
        System.out.println("Pas2. Adaugam cacao si ciocolata");
        System.out.println("Pas3. Servim in ceasca de "+this.volum+" ml");
    }

    @Override
    public String getDetalii() {
        return "Bautura "+this.nume+" are "+this.volum+" ml si costa "+this.pret+" RON";
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        System.out.println("Topping ul a fost adaugat");
        this.pret+=5.00;
        return true;
    }

    @Override
    public IBautura copiaza() {
        return new CiocolataCalda(this);
    }
}
