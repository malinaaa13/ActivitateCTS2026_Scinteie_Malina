package facade.restaurantB6.main;

import facade.restaurantB6.fatada.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();
        facade.verificareMasa(2);
        facade.verificareMasa(1);
        facade.verificareMasa(4);
    }
}
