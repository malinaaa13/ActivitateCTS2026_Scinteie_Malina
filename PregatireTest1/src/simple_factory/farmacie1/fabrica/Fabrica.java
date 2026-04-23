package simple_factory.farmacie1.fabrica;

import simple_factory.farmacie1.clase.MedicamentBody;
import simple_factory.farmacie1.clase.MedicamentDurere;
import simple_factory.farmacie1.clase.Medicament;
import simple_factory.farmacie1.clase.MedicamentRaceala;

public class Fabrica {
    public  Medicament creareMedicament(TIpMedicament tip, String denumire, double pret){
        switch (tip) {
            case TIpMedicament.raceala -> {
                return new MedicamentRaceala(pret, denumire);
            }
            case TIpMedicament.durere -> {
                return new MedicamentDurere(pret, denumire);
            }
            case TIpMedicament.body -> {
                return new MedicamentBody(pret, denumire);
            }
            default -> {
                return null;
            }
        }
    }
}
