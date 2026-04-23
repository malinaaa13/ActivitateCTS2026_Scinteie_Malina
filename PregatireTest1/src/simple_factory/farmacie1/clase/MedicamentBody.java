package simple_factory.farmacie1.clase;

public class MedicamentBody extends MedicamentAbstract{
    public MedicamentBody(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Medicamentul "+super.denumire+ " este pentru body");
    }
}
