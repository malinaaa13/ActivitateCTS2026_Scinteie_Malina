package factory_method.agentie.main;

import factory_method.agentie.clase.PachetTuristic;
import factory_method.agentie.fabrici.Factory;
import factory_method.agentie.fabrici.FactoryPachetAllInclusive;
import factory_method.agentie.fabrici.FactoryPachetCazare;

public class Program {
    private static void afisare (Factory factory){
        PachetTuristic pachet = factory.crearePachet();
        pachet.descriere();
    }


    public static void main(String[] args) {
        afisare(new FactoryPachetCazare());
        afisare(new FactoryPachetAllInclusive());

//        Factory fabricaCazare = new FactoryPachetCazare();
//        Factory fabricaAllInclusive = new FactoryPachetAllInclusive();
//
//        PachetTuristic pachet1 = fabricaCazare.crearePachet();
//        pachet1.descriere();
//
//        PachetTuristic pachet2 = fabricaAllInclusive.crearePachet();
//        pachet2.descriere();
    }
}
