package adapter.spitalA5.aplicatie_farmacie;

import adapter.spitalA5.aplicatie_spital.MedicamentSpital;

public class AdapterMedicamentSpital extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdapterMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
