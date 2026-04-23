package subiecte.service1.main;

import subiecte.service1.simpletfactory.factory.Factory;
import subiecte.service1.simpletfactory.factory.TipMasina;
import subiecte.service1.singleton.AMasina;
import subiecte.service1.singleton.Masina;
import subiecte.service1.singleton.Service;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("BMW", "A2", "VS12RAI", 2008, "Pop Daniela");
        Masina masina2 = new Masina("Audi", "A4", "B05VUR",2010, "Tudose Irina");
        Masina masina3 = new Masina("Dacia", "Duster", "TR45UNI", 2009, "Claudiu Ilinca");
        Masina masina4 = new Masina("Dacia", "Logan", "IF56TRY", 2008, "Isidor Daria");

        Service service = Service.getInstance();
        service.setAdresa("Str Libertatii 7");

        service.primesteMasina(masina1);
        service.primesteMasina(masina2);
        service.elibereazaService();
        service.primesteMasina(masina2);
        service.elibereazaService();
        service.primesteMasina(masina3);
        service.elibereazaService();
        service.primesteMasina(masina4);
        service.elibereazaService();
        System.out.println(service);


        //Testare Simple Factory
        System.out.println("\n------------------------\n");
        Factory fabrica = new Factory();
        AMasina SUV1 = fabrica.creareMasina(TipMasina.SUV, "BMW", "A2", "VS12RAI", 2008);
        System.out.println(SUV1.toString());
        AMasina SUV2 = fabrica.creareMasina(TipMasina.SUV, "Audi", "A4", "B05VUR",2010);
        System.out.println(SUV2.toString());
        AMasina VAN = fabrica.creareMasina(TipMasina.VAN, "Dacia", "Duster", "TR45UNI", 2009);
        System.out.println(VAN);
        AMasina SEDAN = fabrica.creareMasina(TipMasina.SEDAN, "Dacia", "Logan", "IF56TRY", 2008);
        System.out.println(SEDAN);
    }
}
