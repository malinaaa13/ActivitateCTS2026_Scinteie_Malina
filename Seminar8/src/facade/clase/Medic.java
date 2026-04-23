package facade.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean areBiletDeTrimitere(Pacient pacient){
        return pacient.getGravitate() >= 6;
    }
}
