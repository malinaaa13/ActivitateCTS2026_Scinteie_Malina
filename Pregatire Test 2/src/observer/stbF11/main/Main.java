package observer.stbF11.main;

import observer.stbF11.clase.Autobuz;
import observer.stbF11.clase.Calator;
import observer.stbF11.clase.IAutobuz;
import observer.stbF11.clase.ICalator;

public class Main {
    public static void main(String[] args) {
        ICalator calator1 = new Calator("Delcu");
        ICalator calator2 = new Calator("Gicu");
        ICalator calator3 = new Calator("Menciu");

        IAutobuz autobuz = new Autobuz("163");
        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.adaugaCalator(calator3);
        ((Autobuz)autobuz).notificaPlecare();

        autobuz.dezabonareCalator(calator3);
        System.out.println();
        ((Autobuz)autobuz).notificaPlecare();
    }
}
