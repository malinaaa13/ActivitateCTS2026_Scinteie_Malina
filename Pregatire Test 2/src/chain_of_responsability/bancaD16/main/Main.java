package chain_of_responsability.bancaD16.main;

import chain_of_responsability.bancaD16.clase.AlDoileaCont;
import chain_of_responsability.bancaD16.clase.AlTreileaCont;
import chain_of_responsability.bancaD16.clase.ContHandler;
import chain_of_responsability.bancaD16.clase.PrimulCont;

public class Main {
    public static void main(String[] args) {
        ContHandler cont1 = new PrimulCont(100);
        ContHandler cont2 = new AlDoileaCont(200);
        ContHandler cont3 = new AlTreileaCont(290);

        cont1.setSuccesor(cont2);
        cont2.setSuccesor(cont3);

        cont1.plateste(300);
        cont1.plateste(150);
        cont1.plateste(250.66);
    }
}
