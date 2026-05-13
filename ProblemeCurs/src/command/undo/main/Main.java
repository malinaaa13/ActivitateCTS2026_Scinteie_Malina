package command.undo.main;

import command.undo.clase.*;


public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new PachetCazare(20);

        Operator operator = new Operator();

        Command vanzare = new ComandaVanzare(pachet);
        Command rezervare = new ComandaRezervare(pachet);

        operator.invoca(rezervare);
        operator.invoca(vanzare);

        operator.undo();
        operator.undo();
    }
}
