package factory_method.pachettransport.fabrici;

import factory_method.pachettransport.clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachetTuristic tip);
}
