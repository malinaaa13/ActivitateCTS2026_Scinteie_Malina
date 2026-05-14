package biblioteca.composite.main;

import biblioteca.composite.clase.CarteIndividuala;
import biblioteca.composite.clase.Colectie;
import biblioteca.composite.clase.ElementBiblioteca;
import biblioteca.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura carte1 = new CarteIndividuala("Orasul Oaselor", "Cassandra Claire", "12.03.2016");
        Structura carte2 = new CarteIndividuala("Orasul de Sticla", "Cassandra Claire", "12.03.2018");
        Structura carte3 = new CarteIndividuala("Orasul de Cenusa", "Cassandra Claire", "12.03.2019");


        Structura colectieInstrumenteMortale = new Colectie("Instrumente Mortale");
        Structura colectieFantasy = new Colectie("Fantasy ");

        colectieFantasy.adaugaStructura(colectieInstrumenteMortale);
        colectieInstrumenteMortale.adaugaStructura(carte1);
        colectieInstrumenteMortale.adaugaStructura(carte2);
        colectieInstrumenteMortale.adaugaStructura(carte3);
        colectieInstrumenteMortale.stergeStructura(carte1);
        colectieFantasy.printeazaInformatii();

        System.out.println(colectieFantasy.getStructura(0));

    }
}
