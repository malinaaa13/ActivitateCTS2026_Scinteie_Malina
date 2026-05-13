package chain_of_responsability.stbF12.main;

import chain_of_responsability.stbF12.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatoriHandler troleibuz = new CalatorieTroleibuz();
        CalatoriHandler autobuz = new CalatorieAutobuz();
        CalatoriHandler tramvai = new CalatorieTramvai();
        CalatoriHandler metrou = new CalatorieMetrou();

        troleibuz.setCalatorieHandler(autobuz);
        autobuz.setCalatorieHandler(tramvai);
        tramvai.setCalatorieHandler(metrou);

        System.out.println(troleibuz.recomandaCalatoria(2));
        System.out.println(troleibuz.recomandaCalatoria(5));
        System.out.println(troleibuz.recomandaCalatoria(11));
        System.out.println(troleibuz.recomandaCalatoria(4));
    }
}
