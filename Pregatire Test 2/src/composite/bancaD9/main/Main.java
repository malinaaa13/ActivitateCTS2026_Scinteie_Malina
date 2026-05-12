package composite.bancaD9.main;

import composite.bancaD9.clase.Agentie;
import composite.bancaD9.clase.Filiala;
import composite.bancaD9.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura agentieBucuresti = new Agentie("Bucuresti");
        Structura agentieSectorul6 = new Agentie("Sectorul 6");
        Structura filialaCrangasi = new Filiala("Crangasi");
        Structura filialaBasarab = new Filiala("Basarab");
        Structura filialaCotroceni = new Filiala("Cotroceni");

        agentieBucuresti.adaugaNod(agentieSectorul6);
        agentieSectorul6.adaugaNod(filialaCrangasi);
        agentieSectorul6.adaugaNod(filialaBasarab);
        agentieSectorul6.adaugaNod(filialaCotroceni);

        agentieSectorul6.stergeNod(filialaBasarab);

        agentieBucuresti.descriere();

        System.out.println();
        Structura structura = agentieBucuresti.getNod(0);
        structura.descriere();

        System.out.println();
        Structura structura1 = agentieSectorul6.getNod(1);
        structura1.descriere();

    }
}
