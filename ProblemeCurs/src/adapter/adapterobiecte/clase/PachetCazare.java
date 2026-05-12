package adapter.adapterobiecte.clase;

import adapter.adapterclase.clase.PachetTuristic;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine doar cazare");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Ati rezervat pachetul de cazare");
    }
}
