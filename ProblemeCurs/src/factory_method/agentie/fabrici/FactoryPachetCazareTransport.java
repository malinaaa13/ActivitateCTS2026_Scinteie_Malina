package factory_method.agentie.fabrici;

import factory_method.agentie.clase.PachetCazareTransport;
import factory_method.agentie.clase.PachetTuristic;

public class FactoryPachetCazareTransport implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetCazareTransport();
    }
}
