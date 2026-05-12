package chain_of_responsability.main;

import chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler troleibuz = new CalatorieTroleibuz();
        CalatorieHandler autobuz = new CalatorieAutobuz();
        CalatorieHandler tramvai = new CalatorieTramvai();
        CalatorieHandler metrou = new CalatorieMetrou();

        troleibuz.setCalatorieHandler(autobuz);
        autobuz.setCalatorieHandler(tramvai);
        tramvai.setCalatorieHandler(metrou);

        System.out.println(troleibuz.recomandaCalatorie(2));

        System.out.println(troleibuz.recomandaCalatorie(5));

        System.out.println(troleibuz.recomandaCalatorie(11));

        System.out.println(troleibuz.recomandaCalatorie(4));
    }
}
