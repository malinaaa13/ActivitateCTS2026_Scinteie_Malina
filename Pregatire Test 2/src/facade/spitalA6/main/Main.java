package facade.spitalA6.main;

import facade.spitalA6.clase.Medic;
import facade.spitalA6.clase.Pacient;
import facade.spitalA6.clase.Salon;
import facade.spitalA6.fatada.SpitalFacade;

public class Main {
    static void main(String[] args) {
        SpitalFacade facade = new SpitalFacade(new Medic("Mocanu Octavian"), Salon.getInstance());
        Pacient pacient1 = new Pacient("Tudose Irina", 34, 7);
        Pacient pacient2 = new Pacient("Irimescu Iuliana", 54, 5);
        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
    }
}
