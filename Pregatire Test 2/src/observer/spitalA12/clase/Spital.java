package observer.spitalA12.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{

    private String nume;
    private List<Pacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<Pacient>();
    }

    @Override
    public void adaugaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void stergePacient(Pacient pacient) {
        pacienti.remove(pacient);
    }

    @Override
    public void notificaPacient(String mesaj) {
        for(Pacient pacient : pacienti){
            pacient.receptioneazaNotificare(this.nume+" : "+mesaj);
        }
    }

    public void notificaVirus(){
        notificaPacient("Exista un virus nou in oras");
    }

    public void notificaEpidemie(){
        notificaPacient("Exista o noua epidemie in oras!");
    }
}
