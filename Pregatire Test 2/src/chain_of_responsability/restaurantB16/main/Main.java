package chain_of_responsability.restaurantB16.main;

import chain_of_responsability.restaurantB16.clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificaSMS();
        Notificator notificatorEmail = new NotificaEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        Client client1 = new Client("Pop Maria", "0876544332", "maria@gmail.com");
        Client client2 = new Client("Stanciu Vlad", null, "vlad@gmail.com");
        Client client3 = new Client("Vasilescu Victoria", null, null);

        notificatorSMS.notifica(client1, "Oferte noi");
        notificatorSMS.notifica(client2,"Reduceri la deserturi");
        notificatorSMS.notifica(client3,"Reduceri la aperitive");


    }
}
