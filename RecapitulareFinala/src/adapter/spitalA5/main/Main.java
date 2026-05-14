package adapter.spitalA5.main;

import adapter.spitalA5.aplicatie_farmacie.AdapterMedicamentSpital;
import adapter.spitalA5.aplicatie_farmacie.MedicamentFarmacie;
import adapter.spitalA5.aplicatie_spital.MedicamentSpital;

public class Main {

    public static void achizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        achizitie(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital();

        AdapterMedicamentSpital medicamentAdaptat = new AdapterMedicamentSpital(medicamentSpital);
        achizitie(medicamentAdaptat);

    }
}
