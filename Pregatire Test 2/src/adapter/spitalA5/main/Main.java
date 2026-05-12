package adapter.spitalA5.main;

import adapter.spitalA5.aplicatiefarmacie.AdapterMedicamentSpital;
import adapter.spitalA5.aplicatiefarmacie.MedicamentFarmacie;
import adapter.spitalA5.aplicatiespital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen", 400);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        realizeazaAchizitie(medicamentFarmacie);

        AdapterMedicamentSpital adapter = new AdapterMedicamentSpital(medicamentSpital);
        realizeazaAchizitie(adapter);
    }
}
