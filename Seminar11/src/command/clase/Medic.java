package command.clase;

public class Medic implements PersonalSpital{
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        //afisam doar in executant
        System.out.println("Medicul "+this.numeMedic+" interneaza pacientul "+pacient.getNumePacient());
    }
}
