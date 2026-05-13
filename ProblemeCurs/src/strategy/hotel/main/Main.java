package strategy.hotel.main;

import strategy.hotel.clase.Client;
import strategy.hotel.clase.VerificareAmericani;
import strategy.hotel.clase.VerificareEuropeniUE;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel", new VerificareAmericani());
        client.verificare();
        client.setModVerificare(new VerificareEuropeniUE());
        client.verificare();
    }
}
