package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Starkov Alina");
        client.platesteTranzactie(230.9);

        client.setModalitateDePlata(new PlataCash());
        client.platesteTranzactie(129.5);
    }
}
