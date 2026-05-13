package strategy.restaurantB11.main;

import strategy.restaurantB11.clase.Client;
import strategy.restaurantB11.clase.PlataCard;
import strategy.restaurantB11.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new PlataCard(), "Gageanu Andra");
        client.efectueazaPlata(200.6);
        client.setModPlata(new PlataCash());
        client.efectueazaPlata(120.8);
    }
}
