package command.clase;

public class Internare implements Command{
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
