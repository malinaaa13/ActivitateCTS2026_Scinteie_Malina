package chain_of_responsability.hotel.observer;

import java.util.List;

public interface Subject {
    void trimiteNotificare(String mesaj);
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);

}
