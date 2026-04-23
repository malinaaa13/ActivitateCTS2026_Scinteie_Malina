package proxy.clase;

public class Spital implements ISpital{
    private String nume;

    public void interneazaPacient(Pacient pacient){
        System.out.println("Pacientul "+pacient.getNume()+" este internat in spitalul "+this.nume);
    }

    public Spital(String nume) {
        this.nume = nume;
    }
}
