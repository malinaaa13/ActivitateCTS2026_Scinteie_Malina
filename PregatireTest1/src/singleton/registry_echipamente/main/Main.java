package singleton.registry_echipamente.main;

import singleton.registry_echipamente.clase.BandaAlergat;
import singleton.registry_echipamente.clase.BicicletaFitness;
import singleton.registry_echipamente.clase.EchipamentRegistry;
import singleton.registry_echipamente.clase.Ganterele;
import subiecte.sala_fitness.singleton.Rezervare;

public class Main {
    public static void main(String[] args) {
        BandaAlergat banda = new BandaAlergat();
        Ganterele ganterele = new Ganterele();
        BicicletaFitness bicicleta = new BicicletaFitness();
        BicicletaFitness bicicletaFitness= new BicicletaFitness();

        try{
            EchipamentRegistry.register("Banda", banda);
            EchipamentRegistry.register("Bicicleta", bicicleta);

            EchipamentRegistry.getEchipament("Bicicleta").afisareDetalii();
            EchipamentRegistry.getEchipament("Banda").afisareDetalii();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
