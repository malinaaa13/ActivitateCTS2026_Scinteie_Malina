package factory_method.agentie.fabrici;

import factory_method.agentie.clase.PachetAllInclusive;
import factory_method.agentie.clase.PachetTuristic;

public class FactoryPachetAllInclusive implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetAllInclusive();
    }
}
