package cinema.flyweight.main;

import cinema.flyweight.clase.FabricaDeBilete;
import cinema.flyweight.clase.IBilet;
import cinema.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaDeBilete fabrica = new FabricaDeBilete();
        //fabrica.getBilet("It");

        IBilet bilet1 = fabrica.getBilet("It", "horror", 230, "adulti");
        System.out.println(fabrica.getBilet("It"));
        Rezervare rezervare1 = new Rezervare(2, 34, "Ioana", "12:50");
        bilet1.afisare(rezervare1);


    }
}
