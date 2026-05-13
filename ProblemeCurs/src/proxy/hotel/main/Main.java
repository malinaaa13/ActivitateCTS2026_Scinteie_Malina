package proxy.hotel.main;

import proxy.agentie.clase.ProxyPachet;
import proxy.hotel.clase.ProxyRezervare;
import proxy.hotel.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(2, 11);
        rezervare.anulare();

        ProxyRezervare rezervareProxy = new ProxyRezervare(rezervare);
        rezervareProxy.anulare();
    }
}
