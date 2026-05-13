package chain_of_responsability.hotel.chain;

import chain_of_responsability.hotel.observer.Client;

public class NotificatorSMS extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon() != null){
            client.primesteSMS(mesaj);
        } else{
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
