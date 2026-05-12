package adapter.spitalA5.aplicatiefarmacie;

import adapter.spitalA5.aplicatiespital.MedicamentSpital;

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

