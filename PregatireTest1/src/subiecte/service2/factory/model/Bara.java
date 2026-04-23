package subiecte.service2.factory.model;

public class Bara implements IComponenta{
    private double dimensiune;

    public Bara(double dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaComponenta() {
        System.out.println("Aceasta este o bara");
    }
}
