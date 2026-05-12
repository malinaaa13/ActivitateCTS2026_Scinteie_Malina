package facade.spitalA6.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean necesitaInternare(Pacient pacient){
        return pacient.getStare() >= 6;
    }
}
