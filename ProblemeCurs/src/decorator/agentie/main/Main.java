package decorator.agentie.main;

import decorator.agentie.clase.PachetCazare;
import decorator.agentie.clase.PachetTuristic;
import decorator.agentie.decorator.OfertaPachetCazare;
import decorator.agentie.decorator.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi anulat");
        System.out.println();

        OfertaPachetTuristic pachetTuristiOferta = new OfertaPachetCazare(pachetTuristic);
        pachetTuristiOferta.descriere();
        System.out.println("Acest pachet poate fi anulat");
        pachetTuristiOferta.anulareRezervare();
    }
}
