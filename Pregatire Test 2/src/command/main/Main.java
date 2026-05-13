package command.main;

import command.clase.*;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Monica");
        Pacient pacient2 = new Pacient("Tudor");

        PersonalSpital medic = new Medic("Vianu");
        PersonalSpital asistenta = new Asistenta("Tanase");
        Command comanda1 = new Internare((Medic) medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Alina")));
        operator.executaFisa();
        operator.executaFisa();



    }
}
