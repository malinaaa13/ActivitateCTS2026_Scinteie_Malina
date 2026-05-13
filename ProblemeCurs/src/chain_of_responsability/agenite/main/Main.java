package chain_of_responsability.agenite.main;

import chain_of_responsability.agenite.clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificaManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Popescu");
        notificatorSMS.notifica(client, "Notificare TEST");

        Client client2 = new Client("Ionescu", "0787655443", "ionecu@gmail.com");
        notificatorSMS.notifica(client2, "Notificare initiala");

        Client client3 = new Client("Tudorache", "tudorache@gmail.com");
        notificatorSMS.notifica(client3, "Email abonare newsletter");
    }
}
