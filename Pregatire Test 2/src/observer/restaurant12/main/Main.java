package observer.restaurant12.main;

import observer.restaurant12.client.Client;
import observer.restaurant12.client.ClientFidel;
import observer.restaurant12.client.IRestaurant;
import observer.restaurant12.client.Restaurant;


public class Main {
    public static void main(String[] args) {
        Client client1 = new ClientFidel("Antonescu");
        Client client2 = new ClientFidel("Barbu");
        Client client3 = new ClientFidel("Carp");

        IRestaurant restaurant = new Restaurant("Balls");

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        ((Restaurant)restaurant).notificaOfertaPret();

        restaurant.abonareClient(client1);
        ((Restaurant) restaurant).notificaMeniuNou();

    }
}
