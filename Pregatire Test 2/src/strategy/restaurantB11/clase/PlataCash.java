package strategy.restaurantB11.clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul "+nume+" a platit suma "+suma+" lei");
    }
}
