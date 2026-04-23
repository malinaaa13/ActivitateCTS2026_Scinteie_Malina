package prototype.main;

import prototype.clase.ContBanca;
import prototype.clase.IContBanca;

public class Main {
    public static void main(String[] args) {
        ContBanca cont = new ContBanca("Pop Diana", "1", "1234567890123456", 124);
        System.out.println(cont);

        IContBanca cont2 = cont.copiaza();
        System.out.println(cont2);
        cont2.setNumeClient("Tudorache Irina");
        System.out.println(cont2);
    }
}
