package chain_of_responsability.hotel.observer;


import chain_of_responsability.hotel.chain.NotificaEmail;
import chain_of_responsability.hotel.chain.NotificaManager;
import chain_of_responsability.hotel.chain.NotificatorSMS;


import java.util.ArrayList;
import java.util.List;

public class Hotel implements Subject{
    private List<Observer> observeri;

    public Hotel() {
        this.observeri = new ArrayList<Observer>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {

         NotificaEmail notificatorEmail = new NotificaEmail();
        NotificatorSMS notificatorSMS = new NotificatorSMS();
        NotificaManager notificatorManager = new NotificaManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        for(Observer observer:observeri){
            notificatorSMS.notifica(((Client)observer), mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }
}
