package chain_of_responsability.hotel.chain;

import chain_of_responsability.hotel.observer.Client;

public class NotificaManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Nu avem date pentru clientul "+client.getNume());
    }
}
