package chain_of_responsability.hotel.main;

import chain_of_responsability.hotel.observer.Client;
import chain_of_responsability.hotel.observer.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Client client1 = new Client("Gigel", "0787655443", "gigel@gmail.com");
        Client client2 = new Client("Irina", null, "irina@gmail.com");
        Client client3 = new Client("Bob", null, null);

        hotel.adaugaObserver(client1);
        hotel.adaugaObserver(client2);
        hotel.adaugaObserver(client3);

        hotel.trimiteNotificare("Astazi nu este apa calda intre 15-17");

    }
}
