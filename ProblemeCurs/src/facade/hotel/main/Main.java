package facade.hotel.main;


import facade.hotel.clase.Facade;

public class Main {
    public static void main(String[] args) {
        int codCamera = 5;
        System.out.println(Facade.verificareDisponibilitaateCamera(codCamera));
    }
}
