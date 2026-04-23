package factory_method.agentie.fabrici;

import factory_method.agentie.clase.PachetCazare;
import factory_method.agentie.clase.PachetTuristic;

public class FactoryPachetCazare implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetCazare();
    }
}
