package simple_factory.farmacie1.main;

import simple_factory.farmacie1.clase.Medicament;
import simple_factory.farmacie1.clase.MedicamentRaceala;
import simple_factory.farmacie1.fabrica.Fabrica;
import simple_factory.farmacie1.fabrica.TIpMedicament;

public class Main {
    public static void main(String[] args) {
        Medicament raceala1 = new MedicamentRaceala(20.6, "coldrex");
        raceala1.detaliiMedicament();

        Fabrica fabrica = new Fabrica();
        Medicament raceala2 = fabrica.creareMedicament(TIpMedicament.raceala, "Teraflu", 35.8);
        raceala2.detaliiMedicament();
        Medicament durere = fabrica.creareMedicament(TIpMedicament.durere, "Nurofen Forte", 45.5);
        durere.detaliiMedicament();
        Medicament body = fabrica.creareMedicament(TIpMedicament.body, "Voltaren", 56.7);
        body.detaliiMedicament();
    }
}
