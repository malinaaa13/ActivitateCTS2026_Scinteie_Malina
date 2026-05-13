package chain_of_responsability.restaurantB16.clase;

public class NotificatorManager extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Nu avem date despre clientul "+client.getNume());
    }
}
