package strategy.hotel.clase;

public class VerificareAmericani implements ModVerificare{
    @Override
    public void verificare(String nume) {
        System.out.println("Am verificat viza lui "+nume);
    }
}
