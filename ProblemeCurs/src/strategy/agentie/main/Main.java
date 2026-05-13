package strategy.agentie.main;

import strategy.agentie.clase.Card;
import strategy.agentie.clase.Client;
import strategy.agentie.clase.PayPal;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu");
        client.plateste(20.7);

        client.setModPlata(new Card());
        client.plateste(300.8);

        client.setModPlata(new PayPal());
        client.plateste(100);
    }
}
