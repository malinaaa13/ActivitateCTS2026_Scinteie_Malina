package spalatorieAuto.chain_of_responsability.main;

import spalatorieAuto.chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractAutoWashOptions optiuni1 = new Options(true, false, true, true);
        AbstractAutoWashOptions optiuni2 = new Options(false, true, true, false);
        AbstractAutoWashOptions optiuni3 = new Options(false, false, true, true);
        AbstractAutoWashOptions optiuni4 = new Options(false, false,false, false);

        SpalatorieHandler tunelSpalare = new TunelSpalare();
        SpalatorieHandler prespalare = new Prespalare();
        SpalatorieHandler perii = new ZonaPerii();
        SpalatorieHandler ceruire = new Ceruire();
        SpalatorieHandler uscare = new Uscare();

        tunelSpalare.setSuccesor(prespalare);
        prespalare.setSuccesor(perii);
        perii.setSuccesor(ceruire);
        ceruire.setSuccesor(uscare);

        System.out.println("Optiuni 1");
        tunelSpalare.spalare(optiuni1);
        System.out.println("\nOptiuni 2:");
        tunelSpalare.spalare(optiuni2);
        System.out.println("\nOptiuni 3:");
        tunelSpalare.spalare(optiuni3);
        System.out.println("\nOptiuni 4:");
        tunelSpalare.spalare(optiuni4);
    }
}
