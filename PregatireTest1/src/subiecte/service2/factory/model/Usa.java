package subiecte.service2.factory.model;

public class Usa implements IComponenta{
    private double latime;
    private double inaltime;

    public Usa(double latime, double inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public void afiseazaComponenta() {
        System.out.println("Usa cu latime "+this.latime+" si inaltime "+this.inaltime);
    }
}
