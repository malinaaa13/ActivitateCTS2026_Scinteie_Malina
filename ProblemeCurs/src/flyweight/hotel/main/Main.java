package flyweight.hotel.main;


import flyweight.hotel.clase.FabricaDeCamere;
import flyweight.hotel.clase.ICamera;
import flyweight.hotel.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervarePopescu = new Rezervare("Popescu", 3);
        Rezervare rezervareIonescu = new Rezervare("Ionescu", 6);
        Rezervare rezervreVasilescu = new Rezervare("Vasilescu", 2);

        FabricaDeCamere fabricaDeCamere = new FabricaDeCamere();

        ICamera camera2 = fabricaDeCamere.getCamera(1);
        camera2.tiparire(rezervreVasilescu);
        fabricaDeCamere.getCamera(1).tiparire(rezervareIonescu);
        fabricaDeCamere.getCamera(2).tiparire(rezervarePopescu);
        System.out.println(fabricaDeCamere.getNrCamere());

    }
}
