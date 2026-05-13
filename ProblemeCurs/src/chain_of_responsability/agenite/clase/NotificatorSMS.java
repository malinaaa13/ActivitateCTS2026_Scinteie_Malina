package chain_of_responsability.agenite.clase;

public class NotificatorSMS extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNr_telefon() != null){
            System.out.println(client.getNume() + " ai un SMS cu mesajul "+mesaj);
        } else{
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
