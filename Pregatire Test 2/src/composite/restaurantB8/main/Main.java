package composite.restaurantB8.main;

import composite.restaurantB8.clase.Item;
import composite.restaurantB8.clase.OptiuneMeniu;
import composite.restaurantB8.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        OptiuneMeniu sDesert = new Sectiune("Desert");
        OptiuneMeniu sBauturi = new Sectiune("Bauturi");
        OptiuneMeniu sSucuri = new Sectiune("Sucuri");
        OptiuneMeniu sCocktails = new Sectiune("Cocktails");
        OptiuneMeniu sDesturiVegane = new Sectiune("Deserturi vegane");

        OptiuneMeniu iApaPlata = new Item("Apa plata");
        OptiuneMeniu iFanta = new Item("Fanta");
        OptiuneMeniu iNegreasa = new Item("Negreasa");

        ((OptiuneMeniu) sDesert).adaugaNod(sDesturiVegane);
        ((OptiuneMeniu)sDesert).adaugaNod(iNegreasa);
        ((OptiuneMeniu)sDesert).stergereNod(sDesturiVegane);
        sDesert.descriere();
    }
}
