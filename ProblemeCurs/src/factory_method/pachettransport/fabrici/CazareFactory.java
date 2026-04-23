package factory_method.pachettransport.fabrici;

import factory_method.pachettransport.clase.CazareCabana;
import factory_method.pachettransport.clase.CazareHotel;
import factory_method.pachettransport.clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory {
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        switch (tip) {
            case TipPachetCazare.CABANA -> {
                return new CazareCabana();
            }
            case TipPachetCazare.HOTEl -> {
                return new CazareHotel();
            }
            default -> {
                return null;
            }
        }
    }
}
