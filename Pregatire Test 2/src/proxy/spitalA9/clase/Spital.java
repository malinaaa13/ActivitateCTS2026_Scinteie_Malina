package proxy.spitalA9.clase;

public class Spital implements ISpital{

    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" a fost internat in spitalul "+this.nume );
    }
}
