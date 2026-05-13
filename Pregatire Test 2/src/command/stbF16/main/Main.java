package command.stbF16.main;

import command.stbF16.clase.Autobuz;
import command.stbF16.clase.Command;
import command.stbF16.clase.Operator;
import command.stbF16.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz = new Autobuz("VS12AAA");

        Command comanda1 = new Plecare(autobuz, 102);

        operator.inregistreazaComanda(comanda1);
        operator.executaComanda();
        operator.inregistreazaComanda(new Plecare(autobuz, 200));
        operator.executaComanda();
        operator.executaComanda();


    }


}
