package flyweight.stbF9.main;

import flyweight.stbF9.clase.Autobuz;
import flyweight.stbF9.clase.AutobuzLinie;
import flyweight.stbF9.clase.FabricaDeLinii;
import flyweight.stbF9.clase.IAutobuzLinie;

public class Main {
    public static void main(String[] args) {
       FabricaDeLinii fabrica = new FabricaDeLinii();

        try {
            IAutobuzLinie linie = new AutobuzLinie(1, 14, "Unirii", "Grivita");

            Autobuz autobuz1 = new Autobuz("Mercedes", 2016, 40);
            Autobuz autobuz2 = new Autobuz("Audi", 2019, 45);

            linie.descriere(autobuz1);

            fabrica.getLinie(2, 44, "Pod Grant", "Opera").descriere(autobuz2);
            fabrica.getLinie(2).descriere(autobuz1);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
