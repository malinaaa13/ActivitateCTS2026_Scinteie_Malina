package adapter.main;

import adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import adapter.aplicatie_farmacie.MedicamentFarmacie;
import adapter.aplicatie_spital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }


    public static void main(String[] args) {
        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
        //realizeazaAchizitie(paracetamol); - Adapter ar permite aceasta transformare

        AdaptorMedicamentSpital paracetamolAdaptat = new AdaptorMedicamentSpital(paracetamol);
        realizeazaAchizitie(paracetamolAdaptat);
        //pt adapter avem nevoie de:
        //interfata trebuie sa fie target ul - la ceea ce dorim sa adaptam?



    }
}
