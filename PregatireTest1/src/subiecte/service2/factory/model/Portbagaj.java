package subiecte.service2.factory.model;

public class Portbagaj implements IComponenta{
    private String tipDeschidere;

    public Portbagaj(String tipDeschidere) {
        this.tipDeschidere = tipDeschidere;
    }

    @Override
    public void afiseazaComponenta() {
        System.out.println("Acesta este un portbajat");
    }
}
