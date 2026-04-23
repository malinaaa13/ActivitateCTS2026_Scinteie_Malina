package subiecte.service2.factory.model;

public class Capota implements IComponenta{
    private String tipCapota;

    public Capota(String tip) {
        this.tipCapota = tip;
    }

    @Override
    public void afiseazaComponenta() {
        System.out.println("Aceasta este o capota");
    }
}
