package strategy.hotel.clase;

public class VerificareEuropeniUE implements ModVerificare{
    @Override
    public void verificare(String nume) {
        System.out.println("Am verificat buletinul lui "+nume);
    }
}
