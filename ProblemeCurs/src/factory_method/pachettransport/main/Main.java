package factory_method.pachettransport.main;

import factory_method.pachettransport.clase.PachetTuristic;
import factory_method.pachettransport.fabrici.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory fabricaCazare = new CazareFactory();
        PachetTuristicFactory fabricaTransport = new TransportFactory();

        PachetTuristic pachet = fabricaCazare.crearePachet(TipPachetCazare.HOTEl);
        pachet.afisareDescriere();
        pachet = fabricaTransport.crearePachet(TipPachetTransport.AUTOBUZ);
        pachet.afisareDescriere();
    }
}
