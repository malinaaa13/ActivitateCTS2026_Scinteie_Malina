package observer.main;

import observer.clase.ISpital;
import observer.clase.Pacient;
import observer.clase.PacientAbonat;
import observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Popescu", 21);
        Pacient pacient2 = new PacientAbonat("Ionescu", 40);
        Pacient pacient3 = new PacientAbonat("Tudorache", 50);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notifcaEpidemie();
        ((Spital)spital).notificaVirus();
    }

}
