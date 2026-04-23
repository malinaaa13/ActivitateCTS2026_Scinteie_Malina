package subiecte.service2.factory.main;


import subiecte.service2.factory.fabrica.FabricaComponente;
import subiecte.service2.factory.fabrica.TipComponenta;
import subiecte.service2.factory.model.IComponenta;

public class Main {
    public static void main(String[] args) {
        FabricaComponente fabrica = new FabricaComponente();

        IComponenta usa = fabrica.creareComponenta(TipComponenta.usa,20.7, 34.9);
        usa.afiseazaComponenta();
        IComponenta capota = fabrica.creareComponenta(TipComponenta.capota, "simpla");
        capota.afiseazaComponenta();
        IComponenta bara = fabrica.creareComponenta(TipComponenta.bara, 20.3);
        bara.afiseazaComponenta();
        IComponenta portbagaj = fabrica.creareComponenta(TipComponenta.portbagaj, "prin apasare");
        portbagaj.afiseazaComponenta();
    }
}
