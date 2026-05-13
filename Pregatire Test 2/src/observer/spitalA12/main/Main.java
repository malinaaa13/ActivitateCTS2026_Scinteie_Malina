package observer.spitalA12.main;

import observer.spitalA12.clase.ISpital;
import observer.spitalA12.clase.Pacient;
import observer.spitalA12.clase.PacientFidel;
import observer.spitalA12.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientFidel("Popescu", 21);
        Pacient pacient2 = new PacientFidel("Ionescu", 43);
        Pacient pacient3 = new PacientFidel("Draghici", 23);

        ISpital spital = new Spital("Militar");

        spital.adaugaPacient(pacient1);
        spital.adaugaPacient(pacient2);
        ((Spital)spital).notificaEpidemie();

        spital.adaugaPacient(pacient3);
        ((Spital) spital).notificaVirus();
    }
}
