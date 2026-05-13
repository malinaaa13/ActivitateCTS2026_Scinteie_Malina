package command.restaurantB15.main;

import command.restaurantB15.clase.*;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(13, 4);
        Operator operator = new Operator();

        Command comanda1 = new RezervareMasa(masa);
        Command comanda2 = new OcupareMasa(masa);

        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.adaugaComanda(comanda2);
        operator.executaComanda();
    }
}
