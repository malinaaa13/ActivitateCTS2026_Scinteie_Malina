package factory_method.pachettransport.fabrici;

import factory_method.pachettransport.clase.PachetTuristic;
import factory_method.pachettransport.clase.TransportAutobuz;
import factory_method.pachettransport.clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        return switch (tip) {
            case TipPachetTransport.AUTOBUZ ->
                    new TransportAutobuz();

            case TipPachetTransport.MICROBUZ ->
                new TransportMicrobuz();

            default -> null;
        };
    }
}
