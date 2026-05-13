package strategy.bancaD11.main;

import strategy.bancaD11.clase.Client;
import strategy.bancaD11.clase.ProcesarePersoaneFizice;
import strategy.bancaD11.clase.ProcesarePersoaneJuridice;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ProcesarePersoaneFizice(), "Popescu");
        client.verificareDocumente();

        client.setModProcesare(new ProcesarePersoaneJuridice());
        client.verificareDocumente();
    }
}
