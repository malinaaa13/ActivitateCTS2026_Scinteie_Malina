package subiecte.cafenea.main;

import subiecte.cafenea.factory_clase.BauturaAbstract;
import subiecte.cafenea.factory_clase.Factory;
import subiecte.cafenea.factory_clase.IBautura;
import subiecte.cafenea.factory_clase.TipBautura;
import subiecte.cafenea.prototype.BauturaRegistry;
import subiecte.cafenea.singleton_clase.CasaDeMarcat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        IBautura capucinno = factory.creareBautura(TipBautura.CAFEA, "Capucinno", 250, 23);
        System.out.println(capucinno.getDetalii());

        IBautura ceaiMenta = factory.creareBautura(TipBautura.CEAI, "Ceai Menta", 300, 14);
        ceaiMenta.preparare();
        IBautura ciocolataCaldaCaramel = factory.creareBautura(TipBautura.CIOCOLATA_CALDA, "Ciocolata calda caramel", 350, 34);
        System.out.println(ciocolataCaldaCaramel.getDetalii());
        ciocolataCaldaCaramel.adaugaTopping();
        System.out.println(ciocolataCaldaCaramel.getDetalii());

        IBautura latte = factory.creareBautura(TipBautura.CAFEA, "Latte", 200, 25);
        System.out.println(latte.getDetalii());
        latte.adaugaTopping();
        System.out.println(latte.getPret());


        //Testare Singleton
        List<IBautura> lista1 = new ArrayList<IBautura>();
        lista1.add(ceaiMenta);
        lista1.add(capucinno);

        List<IBautura> lista2 = new ArrayList<IBautura>();
        lista2.add(ciocolataCaldaCaramel);

        CasaDeMarcat casaDeMarcat1 = CasaDeMarcat.getInstance(lista1);
        casaDeMarcat1.afiseazaComandaCurenta();

        CasaDeMarcat casaDeMarcat2 = CasaDeMarcat.getInstance(lista2);
        casaDeMarcat2.afiseazaComandaCurenta();

        System.out.println(casaDeMarcat1.calculeazaPretTotal());
        System.out.println(casaDeMarcat2.calculeazaPretTotal());

        casaDeMarcat1.adaugaBautura(ciocolataCaldaCaramel);

        casaDeMarcat2.afiseazaComandaCurenta();

        casaDeMarcat1.finalizeazaComanda();
        casaDeMarcat2.afiseazaComandaCurenta();

        //Testare prototype
        IBautura lattePrototip = factory.creareBautura(TipBautura.CAFEA, "Latte", 350, 25);

        BauturaRegistry registry = new BauturaRegistry();
        registry.adaugaReteta("LatteFidel", lattePrototip);

        IBautura comanda1 = factory.creareBautura(TipBautura.CEAI, "Ceai negru", 200,10);
        IBautura comanda2 = factory.creareBautura(TipBautura.CAFEA, "Espresso", 30, 8);

        // Acestea sunt COPII (Prototype)
        IBautura comanda3 = registry.getReteta("LatteFidel");
        IBautura comanda4 = registry.getReteta("LatteFidel");

        // Dovada: comanda3 și comanda4 sunt obiecte diferite în memorie, dar au aceleași date
        System.out.println(comanda3.getDetalii());
        System.out.println(comanda4.getDetalii());

        if (comanda3 != lattePrototip && comanda3 != comanda4) {
            System.out.println("Succes: Comenzile 3 și 4 sunt COPII fidele ale prototipului!");
        }
    }
}
