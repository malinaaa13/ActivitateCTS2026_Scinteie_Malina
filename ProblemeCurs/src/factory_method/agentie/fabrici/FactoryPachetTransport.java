package factory_method.agentie.fabrici;

import factory_method.agentie.clase.PachetTransport;
import factory_method.agentie.clase.PachetTuristic;

public class FactoryPachetTransport implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetTransport();
    }
}
