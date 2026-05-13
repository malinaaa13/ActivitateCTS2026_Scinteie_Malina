package strategy.hotel.clase;

public class VerificareNonUE implements ModVerificare{

    @Override
    public void verificare(String nume) {
        System.out.println("Am verificat pasaportul lui "+nume);
    }
}
