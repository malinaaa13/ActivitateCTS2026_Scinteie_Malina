package proxy.restaurantB9.main;

import proxy.restaurantB9.clase.IRezervare;
import proxy.restaurantB9.clase.Rezervare;
import proxy.restaurantB9.proxy.ProxyRezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(3, 2);
        rezervare.rezerva();

        ProxyRezervare proxyRezervare = new ProxyRezervare(rezervare);
        proxyRezervare.rezerva();

    }
}
