package builder.cont_bancar_v1.main;

import builder.cont_bancar_v1.clase.BuilderCont;
import builder.cont_bancar_v1.clase.ContBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        cont.setDestinatar("Popescu Ion");
        cont.setSuma(1000);
        cont.setMoneda("RON");
        cont.setContSalariu(true);
        cont.setCardAtasat(true);

        System.out.println(cont.toString());

        ContBancar cont2 = new BuilderCont().setDestinatar("Ursu Daniela").setSuma(3000)
                .setAreCardAtasat(true).setContSalariu(true).build();
        System.out.println(cont2);

    }
}
