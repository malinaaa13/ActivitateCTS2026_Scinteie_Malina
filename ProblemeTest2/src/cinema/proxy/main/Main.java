package cinema.proxy.main;

import cinema.proxy.clase.IRezervare;
import cinema.proxy.clase.ProxyRezervare;
import cinema.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare1 = new Rezervare("Ioana", true, true, true);
        IRezervare rezervare2 = new Rezervare("Maria", false, true, true);
        IRezervare rezervare3 = new Rezervare("Tudor", true, false, true);


        ProxyRezervare proxyRezervare = new ProxyRezervare((Rezervare) rezervare1);
        proxyRezervare.rezervaOnline();

        ProxyRezervare proxyRezervare1 = new ProxyRezervare((Rezervare) rezervare2);
        proxyRezervare1.rezervaOnline();

        ProxyRezervare proxyRezervare2 = new ProxyRezervare((Rezervare) rezervare3);
        proxyRezervare2.rezervaOnline();

    }
}
