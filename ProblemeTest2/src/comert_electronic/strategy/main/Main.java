package comert_electronic.strategy.main;

import comert_electronic.strategy.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator = new Utilizator(new CrescatorPret());

        System.out.println("Afisare produse in ordine crescatoare dupa pret:");
        utilizator.vizualizareProduse();

        utilizator.setModVizualizare(new DescrescatorPret());
        System.out.println("\nAfisare descrescatoare dupa pret:");
        utilizator.vizualizareProduse();

        utilizator.setModVizualizare(new CelPutinORecenzie());
        System.out.println("\nAfisare produse cu cel putin o recenzie:");
        utilizator.vizualizareProduse();
    }
}
