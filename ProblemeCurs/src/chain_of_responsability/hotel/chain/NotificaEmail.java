package chain_of_responsability.hotel.chain;

import chain_of_responsability.hotel.observer.Client;

public class NotificaEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            client.primesteEmail(mesaj);
        } else{
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
