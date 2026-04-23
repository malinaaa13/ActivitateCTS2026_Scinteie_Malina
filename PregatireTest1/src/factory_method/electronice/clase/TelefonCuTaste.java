package factory_method.electronice.clase;

public class TelefonCuTaste extends Telefon{
    public TelefonCuTaste(double dimensiuneDisplay, String culoare) {
        super(dimensiuneDisplay, culoare);
    }

    @Override
    public void afiseaza() {
        System.out.println("Telefon cu dimensiunea display-ului "+super.dimensiuneDisplay+" are culoare"+
                super.culoare + " si este un telefon cu butoane");
    }
}
